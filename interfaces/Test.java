package interfaces;

public class Test {

  public static void main(String[] args) {

    Shape shape = new Circle(12);
    Shape shape1 = new Rectangle(12,12);
    System.out.println(shape.square());
    System.out.println(shape1.square());
    System.out.println(shape.pmt());
    System.out.println(shape1.pmt());

  }

}
