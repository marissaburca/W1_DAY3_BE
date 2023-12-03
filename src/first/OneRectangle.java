package first;

import java.util.Scanner;

public class OneRectangle {
    public static void stamptaRettangolo ( Rettangolo a) {
        int area = a.area();
        int perimeter = a.perimeter();
        System.out.println("First rectangle area: "+ area +", perimeter "+  perimeter);
    }
}