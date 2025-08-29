package registration1;

import java.util.Scanner;

public class Registration implements MethodCheck {

  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private int age;
  Scanner sc = new Scanner(System.in);
  Scanner sc1 = new Scanner(System.in);

  Checking check = new Checking();

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void checkFirstName(String firstName) {
    boolean res = true;
    while (res) {
      System.out.print("Enter your first name:");
      firstName = sc.nextLine();
      if (check.checkFirstName(firstName)) {
        res = false;
      }
    }

  }

  @Override
  public void checkLastName(String lastName) {
    boolean res = true;
    while (res) {
      System.out.print("Enter your last name:");
      lastName = sc.nextLine();
      if (check.checkLastName(lastName)) {
        res = false;
      }
    }

  }

  @Override
  public void checkAge(int age) {
    boolean res = true;
    while (res) {
      System.out.print("Enter your age:");
      age = sc1.nextInt();
      if (check.checkAge(age)) {
        res = false;
      }
    }

  }

  @Override
  public void checkEmail(String email) {
    boolean res = true;
    while (res) {
      System.out.print("Enter your email:");
      email = sc.nextLine();
      if (check.checkEmail(email)) {
        res = false;
      }
    }

  }

  @Override
  public void checkPassword(String password) {
    boolean res = true;
    while (res) {
      System.out.print("Enter your password:");
      password = sc.nextLine();
      if (check.checkPassword(password)) {
        res = false;
      }
    }

  }
}
