import java.util.Scanner;



public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();


        System.out.println("Sum of: "+(a+b));
        System.out.println("Difference of: "+(a-b));
        System.out.println("Product of: "+a*b);
        System.out.println("Quoteint of: "+a/b);
        System.out.println("Remainder of: "+a%b);

        sc.close();
    }
}
