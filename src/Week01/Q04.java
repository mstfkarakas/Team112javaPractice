package Practice01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

         /*
        Write a Java program to divide two numbers and print on the screen
        Test Data: 50/3 Expected output = 16.6666
        We should define int or double according the EXPECTED OUTPUT
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number to be divided: ");
        double firstNumber = scan.nextInt();
        System.out.println("Enter second number to divide the first one: ");
        double secondNumber = scan.nextInt();

        System.out.println("The quotient is: " + (firstNumber/secondNumber));




    }
}
