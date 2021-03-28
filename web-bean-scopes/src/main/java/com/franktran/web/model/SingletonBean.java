package com.franktran.web.model;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

  private int no;

  public SingletonBean() {
    System.out.println("SingletonBean()");
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }
}
