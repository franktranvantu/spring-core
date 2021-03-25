package com.franktran.dao;

import com.franktran.mapper.MarksMapper;
import com.franktran.model.Marks;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MarksDao {

    private final JdbcTemplate jdbcTemplate;
    private final MarksMapper marksMapper;

    public MarksDao(JdbcTemplate jdbcTemplate, MarksMapper marksMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.marksMapper = marksMapper;
    }

    public void dropTableMarks() {
        String sql = "DROP TABLE IF EXISTS marks";
        jdbcTemplate.execute(sql);
    }

    public void createTableMarks() {
        String sql = "CREATE TABLE marks(" +
                "   student_id INT NOT NULL," +
                "   marks  INT NOT NULL," +
                "   years   INT NOT NULL" +
                ");";
        jdbcTemplate.execute(sql);
    }

    public int insertMarks(Marks marks) {
        String sql = "INSERT INTO marks (student_id, marks, years) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[]{marks.getStudentId(), marks.getMarks(), marks.getYears()});
    }

    public int[] insertMarsList(List<Marks> marksList) {
        String sql = "INSERT INTO marks (student_id, name, age) VALUES (?, ?, ?)";
        List<Object[]> params = new ArrayList<>();
        marksList.stream().forEach(marks -> params.add(new Object[]{marks.getStudentId(), marks.getMarks(), marks.getYears()}));
        return jdbcTemplate.batchUpdate(sql, params);
    }

    public int updateMarks(Marks marks) {
        String sql = "UPDATE marks SET marks = ?, years = ? WHERE student_id = ?";
        return jdbcTemplate.update(sql, new Object[]{marks.getMarks(), marks.getYears(), marks.getStudentId()});
    }

    public int deleteMarks(int studentId) {
        String sql = "DELETE FROM marks WHERE student_idid = ?";
        return jdbcTemplate.update(sql, new Object[]{studentId});
    }

    public List<Marks> selectAllMarks() {
        return jdbcTemplate.query("SELECT * FROM marks", marksMapper);
    }

    public Marks selectMarksByStudentId(int studentId) {
        String sql = "SELECT * FROM marks WHERE student_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{studentId}, marksMapper);
    }
}
