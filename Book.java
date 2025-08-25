public class Book {

  public String title; // field
  public int bookCount;
  public int id;// field

  public Book(String title, int bookCount) {
    this.title = title;
    this.bookCount = bookCount;
  }

  public Book(int id,String title, int bookCount) {
    this(title,bookCount);
    this.id=id;
  }

  public Book(Book book) {
    this.title = book.title + 2;
    this.bookCount = book.bookCount + 1000;
  }

  public void displayBook() {
    System.out.printf("Book id:%d%nBook name: %s%nBook pages: %d%n",id, title, bookCount);
  }

}
