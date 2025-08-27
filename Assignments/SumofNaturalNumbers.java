package Assignments;

import java.util.*;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit:");
        int sum = 0;
        int inp = sc.nextInt();

        for(int i = 1; i <= inp ; i++){
            sum+=i;
        }

        System.out.print("The Sum is: "+sum);
        sc.close();


    }
    
}