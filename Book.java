public class Book {

  public String title; // field
  public int bookCount;// field

  public Book(String title, int bookCount) {
    this.title = title;
    this.bookCount = bookCount;
  }

  public Book(Book book) {
    this.title = book.title + 2;
    this.bookCount = book.bookCount + 1000;
  }

  public void displayBook() {
    System.out.printf("Book name: %s%nBook pages: %d%n", title, bookCount);
  }

}
