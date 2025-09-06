package education;

import java.util.Scanner;

public class Users {

  public static Scanner sc = new Scanner(System.in);
  public static boolean flag = true;
  String[] users = new String[20];

  public void allUsers() {
    for (int i = 0; i < users.length; i++) {
      if (users[i] != null) {
        System.out.println(i + "-" + users[i]);
      }
    }

  }

  public void addUser() {
    while (flag) {
      System.out.print("Enter new user number:");
      int userNum = sc.nextInt();
      if (users[userNum] == null) {
        System.out.print("Enter new user name:");
        String newName = sc.next();
        users[userNum] = newName;
        System.out.println("New user has been added.");
        flag = false;
      }
    }


  }

  public void editUser() {
    while (flag) {
      System.out.print("Enter edit user number:");
      int userNum = sc.nextInt();
      if (users[userNum] != null) {
        System.out.print("Enter edit user name:");
        String editName = sc.next();
        users[userNum] = editName;
        System.out.println("User name has been changed successfully.");
        flag = false;
      } else {
        System.out.println("This user does not found.");
      }
    }


  }

  public void deleteUser() {
    while (flag) {
      System.out.print("Enter edit user number:");
      int userNum = sc.nextInt();
      if (users[userNum] != null) {
        users[userNum] = null;
        System.out.println(userNum + "-User has been deleted");
        flag = false;
      } else {
        System.out.println("This user does not found.");
      }
    }


  }

}
