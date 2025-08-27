package com.pdp.online.task.four;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Pen pen = new Pen(10, true, 2, str);
    System.out.println(pen.res(str));


  }






}
