package registration1;

public class Main {

  public static void main(String[] args) {
    Registration reg = new Registration();
    reg.checkAge(reg.getAge());
    reg.checkFirstName(reg.getFirstName());
    reg.checkLastName(reg.getLastName());
    reg.checkEmail(reg.getEmail());
    reg.checkPassword(reg.getPassword());
    System.out.println("Ro'yxatdan o'ttingiz🥳");

  }

}
