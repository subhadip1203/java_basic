package com.subhadip.pahari;

public class Student {
  private int id;
  private String Name;

  public Student() {
  }

  public Student(int id, String Name) {
    this.id = id;
    this.Name = Name;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", Name='" + getName() + "'" +
      "}";
  }

}
