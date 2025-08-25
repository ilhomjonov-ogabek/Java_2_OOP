public class PlayWithClassesAndObjects {

  public static void main(String[] args) {
   /* Book book = new Book("Harry Potter ", 1000);
    book.displayBook();
    Book book2 = new Book(book);
    book2.displayBook();
    Book book3 = new Book(1,"Harry Potter 3", 1500);
    book3.displayBook();*/

    /*Calculator calculator = new Calculator(5,15,'+');
    calculator.calculate();*/

    Todo[] todo = new Todo[3];
    todo[0] = new Todo("Uy vazifa", 5);
    todo[1] = new Todo("Kitob o'qish", 7);
    todo[2] = new Todo("Ishni tugatish", 2);

    todo[0].done();
    todo[1].delete();

    for (Todo i : todo) {
      if (!i.isDeleted) {
        i.print();
      }
    }


  }
}