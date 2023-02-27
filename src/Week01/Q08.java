package Practice01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        /*
        Write a Java program to create the area and the perimeter of a rectangle.
        Test Data: width:5.5 and length: 8.5
        Expected outcome: Area=width*length and Perimeter=2*(width+length)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the width of a rectangle: ");
        double width = scan.nextDouble();

        System.out.println("Please enter the length of a rectangle: ");
        double length = scan.nextDouble();

        double area = width*length;
        double perimeter = 2*(width+length);

        System.out.println("The area of the rectangle is: " + area + " and the perimeter is: " + perimeter);

    }
}
