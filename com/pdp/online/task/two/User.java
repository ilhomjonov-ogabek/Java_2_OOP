package com.pdp.online.task.two;

public class User {

  private String firstName;
  private String lastName;
  private String phoneNumber;
  private int age;
  private boolean isMale;

  public User(String firstName, String lastName, String phoneNumber, int age, boolean isMale) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.isMale = isMale;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isMale() {
    if (isMale) {
      return isMale;
    }else{
      return false;
    }
  }

  public void setMale(boolean male) {
    isMale = male;
  }

  public void result (){
    System.out.printf("Ismi:%s\t%s%nYoshi:%dyosh%nTelefon raqami:%s%nJinsi:%b%n",firstName,lastName,age,phoneNumber,isMale);
  }

}
