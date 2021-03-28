package com.franktran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

//    SingletonDemo singletonDemo1 = context.getBean("singletonDemo", SingletonDemo.class);
//    SingletonDemo singletonDemo2 = context.getBean("singletonDemo", SingletonDemo.class);
//    System.out.println(singletonDemo1 == singletonDemo2);

//    PrototypeDemo prototypeDemo1 = context.getBean("prototypeDemo", PrototypeDemo.class);
//    PrototypeDemo prototypeDemo2 = context.getBean("prototypeDemo", PrototypeDemo.class);
//    System.out.println(prototypeDemo1 == prototypeDemo2);

//    School school = context.getBean("school", School.class);
//    Student student1 = school.getStudent();
//    Student student2 = school.getStudent();
//    System.out.println(student1);
//    System.out.println(student2);

    context.getBean("requestDemo", RequestDemo.class);
  }
}
