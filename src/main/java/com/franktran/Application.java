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

    studentDao.insertStudent(new Student("Frank", 28));
    studentDao.insertStudent(new Student("Henry", 34));
    studentDao.insertStudent(new Student("Bean", 34));
    System.out.println("Select all students:");
    studentDao.selectAllStudents().stream().forEach(System.out::println);


    Student henry = studentDao.selectStudentByName("Henry");
    henry.setAge(40);
    studentDao.updateStudent(henry);
    System.out.println("Update henry's age:");
    studentDao.selectAllStudents().stream().forEach(System.out::println);

    Student bean = studentDao.selectStudentByName("Bean");
    studentDao.deleteStudent(bean.getId());
    System.out.println("Delete student bean:");
    studentDao.selectAllStudents().stream().forEach(System.out::println);

  }
}
