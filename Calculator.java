public class Calculator {
  public int first;
  public int second;
  public char sign;
  public int result;

  public Calculator(int first, int second, char sign) {
    this.first = first;
    this.second = second;
    this.sign = sign;
  }

  public void calculate() {
    if (sign == '+') {
      result = first + second;
    } else if (sign == '-') {
      result = first - second;
    }else if (sign == '*') {
      result = first * second;
    }else if (sign == '/') {
      result = first / second;
    }
    System.out.printf(first + "" +sign  + "" + second + "=" + result);
  }

}
