package com.franktran;

import com.franktran.dao.StudentDao;
import com.franktran.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

    StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    studentDao.dropTableStudent();
    studentDao.createTableStudent();

    studentDao.insertMultipleStudents(
            new Student("Frank", 28),
            new Student("Henry", 34)
    );
    System.out.println("Select all students:");
    studentDao.selectAllStudents().stream().forEach(System.out::println);
  }
}
