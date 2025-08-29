package com.pdp.online.task.person;

import java.util.Scanner;

public class Person {
  protected String name;
  protected String phone;
  private String password;

  public Person(String name, String phone, String password) {
    this.name = name;
    this.phone = phone;
    this.password = password;
  }

  public Person() {
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void changePassword(String password) {
    Scanner sc = new Scanner(System.in);
    if(password.equals(this.password)&&phone.equals(this.phone)) {
      System.out.println("Enter new password:");
      this.password = sc.nextLine();
    }else{
      System.out.println("Wrong password or phone!");
    }

  }

}
