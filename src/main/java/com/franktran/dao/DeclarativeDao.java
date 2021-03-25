package com.franktran.dao;

import com.franktran.model.Marks;
import com.franktran.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DeclarativeDao {

    private final StudentDao studentDao;
    private final MarksDao marksDao;

    public DeclarativeDao(StudentDao studentDao, MarksDao marksDao) {
        this.studentDao = studentDao;
        this.marksDao = marksDao;
    }

    @Transactional
    public void insertStudentAndMarks(Student student, Marks marks) {
        studentDao.insertStudent(student);
        int age = 1/0;
        marksDao.insertMarks(marks);
    }
}
