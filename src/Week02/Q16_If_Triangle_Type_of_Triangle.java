package Week02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        /*
           Get 3 positive numbers from the user, Check the triangle creation status with these numbers
           Rule: if a,b,c are positive then if these conditions (a+b>c>a-b, a+c>b>a-c, b+c>a>b-c) are met,
           this is a triangle.
           if a=b=c this is an Equilateral triangle
           if a=b or a=c or b=c this is an Isosceles triangle
           if a!=b!=c this is a scalene triangle
           Expected Output: Yes This is an Isosceles triangle
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the sides of the triangle. Side1: ");
        int a, b, c;
        a = scan.nextInt();
        System.out.println("Please input the sides of the triangle. Side2: ");
        b = scan.nextInt();
        System.out.println("Please input the sides of the triangle. Side3: ");
        c = scan.nextInt();
        
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Please input positive numbers!");
            return;
        } else if ((a+b>c) && (c>a-b) && (a+c>b) && (b>a-c) && (b+c>a) && (a>b-c)) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("Not a triangle.");
            return;   // return breaks the code.
        } if ((a==b) && (b==c)) {
            System.out.println("Equilateral triangle!");
        } if ((a==b) && (a!=c) && (b!=c) || ((b==c) && (b!=a) && (c!=a) ) || (a==c) && (a!=b) && (c!=b)) {
            System.out.println("Isosceles triangle!");
            // Java says these are always true (not necessary): (b!=c), (c!=a), (c!=b)
        }  if ((a!=b) && (b!=c)) {
            System.out.println("Scalene triangle");
        }
    }
}
