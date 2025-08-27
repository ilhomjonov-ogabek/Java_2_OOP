package com.pdp.online.task.polymorphism;

public class MyMath {
  public String  sum(String a, int b) {
    return a + b;
  }

  public String  sum(String a, double b) {
    return a + b;
  }
  public String  sum(String a, String b) {
    return a + b;
  }
  public int  sum(int a, int b) {
    return a + b;
  }
  public double  sum(double a, double b) {
    return a + b;
  }
  public double  sum(double a, int b) {
    return a + b;
  }

}
