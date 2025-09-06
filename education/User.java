package education;

import java.util.Scanner;

public class User {
  public static Scanner sc = new Scanner(System.in);
  Rooms room = new Rooms();
  Book book = new Book();
  public void user(){
    boolean flag = true;
    while(flag) {
      System.out.println("1. View avaible rooms");
      System.out.println("2. Book a room");
      System.out.println("3. View your booking");
      System.out.println("4. Cancel booking");
      System.out.println("5. Log out");
      System.out.print("Your choice: ");
      int choose = sc.nextInt();
      switch (choose) {
        case 1 -> room.allRooms();
        case 2 -> book.books();
        case 3 -> book.yourBooks();
        case 4 -> book.cancelBooks();
        case 5 -> book.logOut();
        default -> System.out.println("Wrong choice");
      }
    }
  }



}
