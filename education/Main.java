
package education;

import java.util.Scanner;

public class Main {

  public static Scanner sc = new Scanner(System.in);
  public static Scanner sc1 = new Scanner(System.in);

  public static void main(String[] args) {
    Admin admin = new Admin();
    User user = new User();
    String adminPass = "Admin1234";
    String userPass = "User1234";

    System.out.print("1.Admin\n"
        + "2.User\n"
        + "Tanlang:");
    int n = sc1.nextInt();

    System.out.print("Parolini kiriting:");
    String pass = sc.next();
    boolean res = true;
    while (res) {
      if (pass.equals(adminPass)) {
        admin.admin();
        res = false;
      } else if (pass.equals(userPass)) {
        user.user();
        res = false;
      } else {
        System.out.println("Password xato!!!");
      }
    }


  }

  private static void  updateUser(String  Role) {
    if (Role.equals(Roles.ADMIN)) {
      Admin admin = new Admin();

    }
    else {
      User user = new User();
    }
  }

}



