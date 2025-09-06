package wrapperClases;


import java.math.BigDecimal;

public class Character {

  public static void main(String[] args) {
    double a = 2.1;
    double b = 2.2;
    System.out.println(a + b);
    BigDecimal b1 = BigDecimal.valueOf(a);
    BigDecimal b2 = BigDecimal.valueOf(b);
    System.out.println(b1.add(b2));

  }

}
