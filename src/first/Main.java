package first;

public class Main{
    public static void main(String[] args) {
      Rettangolo a = new Rettangolo(5, 8);
      Rettangolo b = new Rettangolo(10, 15);
      Rettangolo c = new Rettangolo(17, 21);
      OneRectangle.stamptaRettangolo(a);
      TwoRectangles.stampaRettangoli(b,c);
    }


}
