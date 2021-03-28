package com.franktran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class School {

  @Autowired
  private Student student;

  public School() {
    System.out.println("School()");
  }

  @Lookup
  public abstract Student createStudent();

  public Student getStudent() {
    return createStudent();
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
