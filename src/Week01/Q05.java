package Practice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

    // Write a Java program to print the sum, multiplication, subtraction, and division and find re remainder of two numbers
    // Test Data: fn: 12 and sn: 5. Expected outputs: 17, 60, 7, 2.4, 2

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        double secondNumber = scan.nextInt();

        double sum = firstNumber+secondNumber;
        System.out.println("The sum is: " + sum);

        double product = firstNumber*secondNumber;
        System.out.println("The product is: " + product);

        double difference = firstNumber-secondNumber;
        System.out.println("The difference is: " + difference);

        double quotient = firstNumber/secondNumber;
        System.out.println("The quotient is: " + (firstNumber/secondNumber));

        System.out.println("The remainder is: " + firstNumber%secondNumber);


    }
}
