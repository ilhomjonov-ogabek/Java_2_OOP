package education;

import java.util.Scanner;

public class Book {
  public static Scanner sc = new Scanner(System.in);
  public static String [] books = new String[10];
  public static String[] myBooks = new String[books.length];
  public static boolean flag = true;


  public void books(){
    books[0] = "Harry Potter 1";
    books[1] = "Harry Potter 2";
    books[2] = "Harry Potter 3";
    books[3] = "Math";
    books[4] = "Physics";
    books[5] = "Software Engineer";
    books[6] = "World languages";
    for(int i=0;i<books.length;i++){
      if(books[i]!=null){
        System.out.println(i+1+"."+books[i]);
      }
    }

  }

  public void yourBooks(){
    for(int i=0;i<myBooks.length;i++){
      if(books[i]!=null){
        System.out.println(i+1+"."+myBooks[i]);
      }
    }

  }

  public void cancelBooks(){
    while(flag){
      System.out.print("Enter book number:");
      int bookNumber = sc.nextInt();
      if (books[bookNumber] != null) {
        books[bookNumber] = null;
        flag = false;
      } else {
        System.out.println("Book " + bookNumber + " doesn't exist");
      }
    }

  }

  public void logOut(){
    System.out.println("Thank you for using our education.");
    return;
  }

}
