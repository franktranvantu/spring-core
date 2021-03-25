package com.franktran.dao;

import com.franktran.model.Marks;
import com.franktran.model.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component
public class CommonDao {

    private final PlatformTransactionManager transactionManager;
    private final StudentDao studentDao;
    private final MarksDao marksDao;

    public CommonDao(PlatformTransactionManager transactionManager, StudentDao studentDao, MarksDao marksDao) {
        this.transactionManager = transactionManager;
        this.studentDao = studentDao;
        this.marksDao = marksDao;
    }

    public void insertStudentAndMarks(Student student, Marks marks) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(transactionDefinition);
        try {
            studentDao.insertStudent(student);
            int age = 1/0;
            marksDao.insertMarks(marks);
            transactionManager.commit(status);
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(status);
            throw e;
        }
    }
}
