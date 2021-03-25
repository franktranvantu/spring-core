package com.franktran.dao;

import com.franktran.mapper.StudentMapper;
import com.franktran.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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
