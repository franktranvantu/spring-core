package com.franktran.web.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationBean {

  private int no;

  public ApplicationBean() {
    System.out.println("ApplicationBean()");
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }
}
