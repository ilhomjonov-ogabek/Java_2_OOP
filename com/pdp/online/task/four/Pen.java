package com.pdp.online.task.four;

public class Pen {

  private int miqdor;
  private boolean clicked;
  private int oneLetter;
  private String str;

  public Pen(int miqdor, boolean clicked, int oneLetter, String str) {
    this.miqdor = miqdor;
    this.clicked = clicked;
    this.oneLetter = oneLetter;
    this.str = str;
  }

  public int getMiqdor() {
    return miqdor;
  }

  public void setMiqdor(int miqdor) {
    if (miqdor > 0) {
      this.miqdor = miqdor;
    } else {
      System.out.println("Miqdor is greater than 100");
    }
  }

  public boolean getClicked() {
    return clicked;
  }

  public void setClicked(boolean clicked) {
    if (clicked) {
      this.clicked = true;
    } else {
      this.clicked = false;
    }

  }

  public int getOneLetter() {
    return oneLetter;
  }

  public void setOneLetter(int oneLetter) {
    this.oneLetter = oneLetter;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

 /* public void result() {
    int num = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {

      }
    }
    System.out.println(str);
  }*/

  public  String res( String str){
    String res = "";
  while (miqdor  != 0) {
      for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i))) {
          miqdor -= 2;
        }
        if (str.charAt(i) == ' ') {

        } else {
          miqdor -= 1;
        }
        res += str.charAt(i);
      }
    }
    return res;
  }
}
