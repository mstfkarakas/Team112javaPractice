package Practice01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        // Print the month when a number between 1 and 12 is entered.
        // Test data: input=2 so the output is February

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1 and 12 to print the corresponding month");
        int number = scan.nextInt();

        if (number==1){
            System.out.println("The corresponding month is January");
        }else if (number==2) {
            System.out.println("The corresponding month is February");

        }else if (number==3) {
            System.out.println("The corresponding month is March");

        }else if (number==4) {
            System.out.println("The corresponding month is April");

        }else if (number==5) {
            System.out.println("The corresponding month is May");

        }else if (number==6) {
            System.out.println("The corresponding month is June");

        }else if (number==7) {
            System.out.println("The corresponding month is July");

        }else if (number==8) {
            System.out.println("The corresponding month is August");

        }else if (number==9) {
            System.out.println("The corresponding month is September");

        }else if (number==10) {
            System.out.println("The corresponding month is October");

        }else if (number==11) {
            System.out.println("The corresponding month is November");

        }else if (number==12) {
            System.out.println("The corresponding month is December");

        }  // else {
           // System.out.println("Invalid entry. Try again.");
           // Instead of this, we cna also include modulus and give a month for any positive number entered.


        }
}
