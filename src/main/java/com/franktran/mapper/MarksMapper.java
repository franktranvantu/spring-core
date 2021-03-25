package com.franktran.mapper;

import com.franktran.model.Marks;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MarksMapper implements RowMapper<Marks> {

    @Override
    public Marks mapRow(ResultSet rs, int rowNum) throws SQLException {
        int studentId = rs.getInt("student_id");
        int marks = rs.getInt("marks");
        int years = rs.getInt("years");
        return new Marks(studentId, marks, years);
    }
}
