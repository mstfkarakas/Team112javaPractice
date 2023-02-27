package Practice01;

public class Q09 {
    public static void main(String[] args) {

        // Swap two variables. a=12 and b=15 and the expected outcome is a=15 and b=12

        int a = 12;
        int b = 15;

        a = a + b;  // a =27
        b = a - b;  // b = 27-15=12
        a = a - b;  // a = 27-12=15

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        // OR with a temporary variable

        int c,d,temp;

        c= 12;
        d=15;

        temp = c;
        c = d;
        d = temp;

        System.out.println("new c= " + c);
        System.out.println(d);

    }
}
