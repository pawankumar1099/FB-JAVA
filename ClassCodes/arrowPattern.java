import java.util.Scanner;

public class arrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        //upper part
        
        for(int i=1;i<=inp/2;i++){
            System.out.print("*");
            for(int j = 1;j<=inp+2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }

        // middle part

        System.out.print("*");

        for(int i =1;i<=(inp+2)+(inp/2)+1;i++){

            System.out.print("*");
            
        }
        System.out.println();


        //lower part

        for(int i=inp/2;i>=1;i--){
            System.out.print("*");
            for(int j = 1;j<=inp+2;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();

        }

        sc.close();

    }
}

