import java.util.Scanner;

public class swap2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter value of B: ");
        int b = sc.nextInt();

        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

    System.out.println("Values Swapped !");
    System.out.println("value of A is : "+a);
    System.out.println("value of B is : "+b);

    }
}
