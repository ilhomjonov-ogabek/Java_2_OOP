package education;

import java.util.Scanner;

public class Rooms {
  public static Scanner sc = new Scanner(System.in);
  public static String[] rooms = new String[10];
  public static boolean flag = true;

  public void allRooms() {
    for (String room : rooms) {
      System.out.println(room);
    }

  }

  public void addRoom() {
    while (flag) {
      System.out.print("Enter room number:");
      int roomNum = sc.nextInt();
      if (rooms[roomNum] == null) {
        System.out.println("Enter room name:");
        String roomName = sc.next();
        rooms[roomNum] = roomName;
        System.out.println("Room added successfully");
        flag = false;
      }else{
        System.out.println("This room has been added.");
      }
    }

  }

  public void editRoom() {
    while (flag) {
      System.out.print("Enter room number:");
      int roomNum = sc.nextInt();
      if (rooms[roomNum] != null) {
        System.out.println("Enter room name:");
        String roomName = sc.next();
        rooms[roomNum] = roomName;
        System.out.println("Room edited successfully");
        flag = false;
      }else{
        System.out.println("This room does not found.");
      }
    }

  }

  public void deleteRoom() {
    while (flag) {
      System.out.print("Enter room number:");
      int roomNum = sc.nextInt();
      if (rooms[roomNum] != null) {
        rooms[roomNum] = null;
        System.out.println(roomNum + "-Room has been deleted");
        flag = false;
      }else{
        System.out.println("This room has been deleted.");
      }
    }

  }

}
