package Practice01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        //  Print sum of two numbers
        //  Test data: 75+12 = 87

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number to add: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second  number to add: ");
        double num2 = scan.nextDouble();

        System.out.println("The sum is: " + (num1+num2));

    }
}
