package Practice01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

    /* Compare two numbers. 6 ways including equal/not equal/ greater/greater or equal etc.


    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();


        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber==secondNumber){
            System.out.println(firstNumber+" is equal to "+secondNumber);
        }if (firstNumber<secondNumber){
            System.out.println(firstNumber+" is smaller than "+secondNumber);
        }if (firstNumber>secondNumber){
            System.out.println(firstNumber+" is greater than "+secondNumber);
        }if (firstNumber<=secondNumber){
            System.out.println(firstNumber+" is smaller than or equal to "+secondNumber);
        }if (firstNumber>=secondNumber){
            System.out.println(firstNumber+" is greater than or equal to "+secondNumber);
        }if (firstNumber!=secondNumber){
            System.out.println(firstNumber+" is not equal to "+secondNumber);
        }

    }
}
