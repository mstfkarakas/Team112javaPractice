package Practice01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        // Print the area and the circumference of a circle with a given r and pi

        double pi, area, circumference;
        pi = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the radius of a circle to find the area and the circumference");
        double radius = scan.nextDouble();
        if (radius<=0) {
            System.out.println("Warning: Please enter a positive value for the radius");
        } else {
            System.out.println("area = " + pi * radius * radius);
            System.out.println("circumference = " + 2 * pi * radius);
        }

    }
}
