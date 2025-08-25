public class Todo {

  public String name;
  public int endDay;
  public boolean isComplete;
  public boolean isDeleted;

  Todo(String name, int endDay) {
    this.name = name;
    this.endDay = endDay;
  }

  public void done() {
    isComplete = true;
  }

  public void delete() {
    isDeleted = true;
  }

  public void print(){
    System.out.println(name+" "+endDay+" "+isComplete);
  }

}
