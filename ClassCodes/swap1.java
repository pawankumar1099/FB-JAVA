import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Enter value of A:");
        int a = sc.nextInt();
        System.out.println( "Enter value of B:");
        int b = sc.nextInt();

        int temp  = a;
        a = b;
        b= temp;
        System.out.println("Values Swapped!");
        System.out.println("Values of A: "+a);
        System.out.println("Values of B: "+b);
        sc.close();

    }     
}
