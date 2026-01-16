package Assignments;

import java.util.*;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int[] arr = new int[n];

         for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
         }
         int i=0;
         int j=1;
        while(i<n-1){
            if(arr[j]<arr[i]){
                System.out.println(arr[j]);
                i++;
                j=i;
            }else if(j==n-1){
                j=i;
                
            }else{
                j++;
            }
        }
        // System.out.print("Enter the Digit:");
        // int sum = 0;
        // int inp = sc.nextInt();

        // for(int i = 1; i <= inp ; i++){
        //     sum+=i;
        // }

        // System.out.print("The Sum is: "+sum);
        // sc.close();


    }
    
}