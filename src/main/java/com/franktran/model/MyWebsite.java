package com.franktran.model;

public class MyWebsite {

  private String name;
  private String category;

  public MyWebsite(String name, String category) {
    this.name = name;
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "MyWebsite{" +
        "name='" + name + '\'' +
        ", category='" + category + '\'' +
        '}';
  }
}
