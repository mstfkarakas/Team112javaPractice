package Practice01;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        /*
        Write a Java program that displays what day it is when a number is entered.
        Test Data: day=8
        Expected output: Monday
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to see the corresponding day of the week: ");
        int number = scan.nextInt();

        number = number%7;

        if (number%7==1){
            System.out.println("Monday");
        } else if (number%7==2){
            System.out.println("Tuesday");

        }else if (number%7==3){
            System.out.println("Wednesday");

        }else if (number%7==4){
            System.out.println("Thursday");

        }else if (number%7==5){
            System.out.println("Friday");

        }else if (number%7==6){
            System.out.println("Saturday");

        }else if (number%7==0){
            System.out.println("Sunday");

        }else {
            System.out.println("Invalid number. Try again.");
        }


    }
}
