public class PlayWithClassesAndObjects {

  public static void main(String[] args) {
    Book book = new Book("Harry Potter ", 1000);
    book.displayBook();
    Book book2 = new Book(book);
    book2.displayBook();

  }
}