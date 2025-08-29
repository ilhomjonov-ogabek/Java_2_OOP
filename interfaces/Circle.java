package interfaces;

import static java.lang.Math.*;

public class Circle implements Shape {

   double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double square() {
    return (PI *radius);
  }

  @Override
  public double pmt() {
    return 2*PI*radius;
  }
}
