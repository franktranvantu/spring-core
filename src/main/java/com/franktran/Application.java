package com.franktran;

import com.franktran.dao.DeclarativeDao;
import com.franktran.dao.ProgrammaticDao;
import com.franktran.model.Marks;
import com.franktran.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

//    ProgrammaticDao programmaticDao = context.getBean("programmaticDao", ProgrammaticDao.class);
    DeclarativeDao declarativeDao = context.getBean("declarativeDao", DeclarativeDao.class);
    Student frank = new Student(4, "Henry", 20);
    Marks marks = new Marks(4, 9, 2021);
    declarativeDao.insertStudentAndMarks(frank, marks);
  }
}
