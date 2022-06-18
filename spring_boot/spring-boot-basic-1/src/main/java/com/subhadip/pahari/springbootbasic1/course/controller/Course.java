package com.subhadip.pahari.springbootbasic1.course.controller;

public class Course {
  private int id;
  private String name;
  private String authour;

  public Course(int id , String name, String authour) {
    super();
    this.id = id;
    this.name = name;
    this.authour = authour;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthour() {
    return this.authour;
  }

  public void setAuthour(String authour) {
    this.authour = authour;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", authour='" + getAuthour() + "'" +
      "}";
  }


}
