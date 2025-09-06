package education;

import java.util.Scanner;

public class Admin {

  public static Scanner sc = new Scanner(System.in);
  public static String[] users = new String[20];
  Rooms room = new Rooms();
  Users user = new Users();

  public void admin() {
    boolean flag = true;
    while (flag) {
      System.out.println("1. View all users");
      System.out.println("2. Add new users");
      System.out.println("3. Edit users");
      System.out.println("4. Delete users");
      System.out.println("5. View all rooms");
      System.out.println("6. Add new room");
      System.out.println("7. Edit room");
      System.out.println("8. Delete room");
      System.out.println("9. Log out");
      System.out.print("Your choice: :");
      int num = sc.nextInt();
      switch (num) {
        case 1 -> user.allUsers();
        case 2 -> user.addUser();
        case 3 -> user.editUser();
        case 4 -> user.deleteUser();
        case 5 -> room.allRooms();
        case 6 -> room.addRoom();
        case 7 -> room.editRoom();
        case 8 -> room.deleteRoom();
        case 9 -> logOut();
        default -> System.out.println("Wrong choice");
      }
    }


  }

  public void logOut() {
    System.out.println("Thank you for using our education.");
    return;
  }


}
