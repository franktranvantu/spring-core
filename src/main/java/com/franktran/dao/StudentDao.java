package com.franktran.dao;

import com.franktran.mapper.StudentResultSetExtractor;
import com.franktran.mapper.StudentRowMapper;
import com.franktran.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {

    private final JdbcTemplate jdbcTemplate;
    private final StudentRowMapper studentRowMapper;
    private final StudentResultSetExtractor studentResultSetExtractor;

    public StudentDao(JdbcTemplate jdbcTemplate, StudentRowMapper studentRowMapper, StudentResultSetExtractor studentResultSetExtractor) {
        this.jdbcTemplate = jdbcTemplate;
        this.studentRowMapper = studentRowMapper;
        this.studentResultSetExtractor = studentResultSetExtractor;
    }

    public void dropTableStudent() {
        String sql = "DROP TABLE IF EXISTS student";
        jdbcTemplate.execute(sql);
    }

    public void createTableStudent() {
        String sql = "CREATE TABLE student(" +
                "    id INT NOT NULL," +
                "    name VARCHAR(20) NOT NULL," +
                "    age  INT NOT NULL," +
                "    PRIMARY KEY (id)" +
                ")";
        jdbcTemplate.execute(sql);
    }

    public int insertStudent(Student student) {
        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[]{student.getId(), student.getName(), student.getAge()});
    }

    public int[] insertStudents(List<Student> students) {
        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        List<Object[]> params = new ArrayList<>();
        students.stream().forEach(student -> params.add(new Object[]{student.getId(), student.getName(), student.getAge()}));
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
        return jdbcTemplate.query("SELECT * FROM student", studentResultSetExtractor);
    }

    public Student selectStudentByName(String name) {
        String sql = "SELECT * FROM student WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, studentRowMapper);
    }
}
