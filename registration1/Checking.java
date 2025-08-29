package registration1;

public class Checking {

  public boolean checkAge(int age) {
    if (age >= 18) {
      return true;
    } else {
      System.out.println("Ro'yxatdan o'tish uchun yoshingiz to'g'ri kelmaydi!");
    }
    return false;
  }

  public boolean checkFirstName(String firstName) {
    if (firstName.length() >= 3) {
      return true;
    } else {
      System.out.println("Ismingiz 3ta harfdan kam bo'lmasligi kerak!");
      return false;
    }
  }


  public boolean checkLastName(String lastName) {
    if (lastName.length() >= 3) {
      return true;
    } else {
      System.out.println("Familyangiz 3ta harfdan kam bo'lmasligi kerak!");
    }
    return false;
  }

  public boolean checkEmail(String email) {
    if (email.substring(email.length()-10).equals("@gmail.com")) {
      return true;

    } else {
      System.out.println("Xato gmail!!!");
    }
    return false;
  }

  public boolean checkPassword(String password) {
    boolean upperWord = false;
    boolean lowerWord = false;
    boolean number = false;
    boolean chars = false;
    boolean special = true;
      if (password.length() >= 8) {
        for (int i = 0; i < password.length(); i++) {
          if (Character.isUpperCase(password.charAt(i))) {
            upperWord = true;
          } else if (Character.isLowerCase(password.charAt(i))) {
            lowerWord = true;
          } else if (Character.isDigit(password.charAt(i))) {
            number = true;
          } else {
            chars = true;
          }

        }

      } else {
        System.out.println("Kodning uzunligi kamida 8tadan kam bo'lmasin!");

      }

    if (upperWord && lowerWord && number && chars) {
      return true;
    } else {
      System.out.println("Xato kod!");

    }
    return false;
  }
}



