package Practice01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

    // Task01:
    // Print Hello and then print your name in another line
    // Sample output:
    // Hello
    // Mustafa Karakas


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String name = scan.nextLine();

        System.out.println("Please enter your surname:");
        String surname = scan.nextLine();

        System.out.println("Hello" + "\n" + name + " " + surname);


    }
}
