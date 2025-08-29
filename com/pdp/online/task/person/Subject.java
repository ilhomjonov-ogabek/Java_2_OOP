package com.pdp.online.task.person;

public class Subject {
  private String name;
  String classNumber;

  public Subject(String name, String classNumber) {
    this.name = name;
    this.classNumber = classNumber;
  }

  public Subject() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClassNumber() {
    return classNumber;
  }

  public void setClassNumber(String classNumber) {
    this.classNumber = classNumber;
  }
}
