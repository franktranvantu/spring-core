package com.franktran.dao;

import com.franktran.mapper.StudentMapper;
import com.franktran.model.Student;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {

    private final JdbcTemplate jdbcTemplate;
    private final StudentMapper studentMapper;

    public StudentDao(JdbcTemplate jdbcTemplate, StudentMapper studentMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.studentMapper = studentMapper;
    }

    public void dropTableStudent() {
        String sql = "DROP TABLE IF EXISTS student";
        jdbcTemplate.execute(sql);
    }

    public void createTableStudent() {
        String sql = "CREATE TABLE IF NOT EXISTS student(\n" +
                "    id   INT NOT NULL AUTO_INCREMENT,\n" +
                "    name VARCHAR(20) NOT NULL,\n" +
                "    age  INT NOT NULL,\n" +
                "    PRIMARY KEY (ID)\n" +
                ")";
        jdbcTemplate.execute(sql);
    }

    public int insertStudent(Student student) {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
        return jdbcTemplate.update(sql, new Object[]{student.getName(), student.getAge()});
    }

    public int insertMultipleStudents(Student student1, Student student2) {
        try (Connection connection = jdbcTemplate.getDataSource().getConnection()) {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
            jdbcTemplate.update(sql, new Object[]{student1.getName(), student1.getAge()});
            int a = 1/0;
            jdbcTemplate.update(sql, new Object[]{student2.getName(), student2.getAge()});
            connection.commit();
            return 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int[] insertStudents(List<Student> students) {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
        List<Object[]> params = new ArrayList<>();
        students.stream().forEach(student -> params.add(new Object[]{student.getName(), student.getAge()}));
        return jdbcTemplate.batchUpdate(sql, params);
    }

    public int updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, age = ? WHERE id = ?";
        return jdbcTemplate.update(sql, new Object[]{student.getName(), student.getAge(), student.getId()});
    }

    public int deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        return jdbcTemplate.update(sql, new Object[]{id});
    }

    public List<Student> selectAllStudents() {
        return jdbcTemplate.query("SELECT * FROM student", studentMapper);
    }

    public Student selectStudentByName(String name) {
        String sql = "SELECT * FROM student WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, studentMapper);
    }
}
