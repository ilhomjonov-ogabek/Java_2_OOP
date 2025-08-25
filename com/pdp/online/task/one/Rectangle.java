package com.pdp.online.task.one;

public class Rectangle {

  private int width;
  private int height;
  private int result;

  public Rectangle() {

  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    if(height > 0) {
      this.height = height;
    }else{
      this.height = 0;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int calculate(int width, int height) {
    result = width * height;
    return result;
  }

}
