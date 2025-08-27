import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int inp = sc.nextInt();
        int temp =inp;
        int k = 1;

        for(int i=1;i<=inp;i++){
            for (int j=inp; j>=i;j--){
                System.out.print(k+" ");
                k=k+temp;
                temp--;
            }
            k=i;
            k++;
            temp=inp;
            System.out.println();
        }
        
        sc.close();
        
    }
}

