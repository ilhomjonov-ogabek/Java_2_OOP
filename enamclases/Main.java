package enamclases;

public class Main {

  public static void main(String[] args) {
   /* Day monday = Day.MONDAY;
    Day tuesday = Day.TUESDAY;
    Day wednesday = Day.WEDNESDAY;
    System.out.println(monday);
    System.out.println(tuesday);
    System.out.println(wednesday);
*/

   Language language = Language.getByName("uz");
   System.out.println(language);
  }

}
