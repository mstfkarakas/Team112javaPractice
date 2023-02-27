package Practice01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
        Write a Java program that takes 3 numbers from the user to calculate and print the average of the numbers.
        Test Data: 10, 20, 30
        Output = (10+20+30)/3=20
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double secondNumber = scan.nextDouble();
        System.out.println("Please enter the third number: ");
        double thirdNumber = scan.nextDouble();

        System.out.println("Their average is: " + (firstNumber+secondNumber+thirdNumber)/3);


    }
}
