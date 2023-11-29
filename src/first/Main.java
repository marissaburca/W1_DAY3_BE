package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's calculate together the perimeter and the area of a rectangle. Enter height:");
        int height= Integer.parseInt(userInput.nextLine());
        System.out.println("Enter width:");
        int width= Integer.parseInt(userInput.nextLine());

        Rettangolo printRectangle = new Rettangolo(height,width);
        int result1 = printRectangle.perimeter();
        int result2 = printRectangle.area();
        System.out.println("The perimeter is equal to: "+ result1 +". The area is: "+ result2);


        System.out.println("Let's make it with two rectangles. Enter first height:");
        int height1= Integer.parseInt(userInput.nextLine());
        System.out.println("Enter first width:");
        int width1= Integer.parseInt(userInput.nextLine());
        System.out.println("Enter second height:");
        int height2= Integer.parseInt(userInput.nextLine());
        System.out.println("Enter second width:");
        int width2= Integer.parseInt(userInput.nextLine());

        Rettangolo printTwoRectangles = new Rettangolo(height1,width1,height2,width2);
        int result3 = printTwoRectangles.perimeter();
        int result4 = printTwoRectangles.area();
        int result5 = printTwoRectangles.perimeter1();
        int result6 = printTwoRectangles.area1();
        int result7 = printTwoRectangles.perimeterTotal();
        int result8 = printTwoRectangles.areaTotal();
        System.out.println("The first perimeter is equal to: "+ result3 +". The area is: "+ result4 +". The second perimeter is equal to: "+ result5 +". The area is: "+ result6 +". The perimeters sum is: "+ result7 + ". The areas sun is: " + result8);

        userInput.close();
    }
}