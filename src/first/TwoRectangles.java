package first;

public class TwoRectangles {
    public static void stampaRettangoli ( Rettangolo b, Rettangolo c) {
        int area = b.area();
        int perimeter = b.perimeter();
        OneRectangle.stamptaRettangolo(b);
        int area1 = c.area();
        int perimeter1 = c.perimeter();
        int areasSum = area+ area1;
        int perimetersSum =perimeter + perimeter1;

        System.out.println("The first rectangle area is " + area + ", and its perimeter is " + perimeter
                + ". The second rectangle area is " + area1 + ", and its perimeter is " + perimeter1
                + ". The sum of the areas is " + areasSum + ", the perimeters sum is " + perimetersSum + ".");
        }
    }

