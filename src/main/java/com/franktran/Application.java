package com.franktran;

import com.franktran.dao.CommonDao;
import com.franktran.model.Marks;
import com.franktran.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

    CommonDao commonDao = context.getBean("commonDao", CommonDao.class);
    Student frank = new Student(2, "Frank", 20);
    Marks marks = new Marks(2, 8, 2021);
    commonDao.insertStudentAndMarks(frank, marks);
  }
}
