import java.util.*;
public class studentResultProject {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Student id: ");
        int id = sc.nextInt();
       
        System.out.print("Enter your Phone Number: ");
        int phone = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter your Email id: ");
        String email = sc.nextLine();
        System.out.println();
        System.out.println("Enter the Subject Marks: ");
        
        int total = 0;

        int[] marks = new int[5];

        for(int i=0;i<5;i++){
            System.out.println("Enter Marks for Subject "+(i+1)+" : ");
            int temp= sc.nextInt();
            total+=temp;
            marks[i]=temp;
        }
        boolean isFail = false;

        System.out.println("Here is Your Result !");

        System.out.println(name);
        System.out.println(id);
        System.out.print("Total Marks: ");
        System.out.println(total+" / "+ marks.length*100);

        for(int i=0;i<5;i++){
            if(marks[i]<=100 && marks[i]>=90){
                System.out.println("Your Grade in Subject "+(i+1)+" is :"+"A");
            }else if(marks[i]<=89 && marks[i]>=70){
                System.out.println("Your Grade in Subject "+(i+1)+" is :"+"B");
            }else if(marks[i]<=69 && marks[i]>=50){
                System.out.println("Your Grade in Subject "+(i+1)+" is :"+"C");
            }else if(marks[i]<=49 && marks[i]>=35){
                System.out.println("Your Grade in Subject "+(i+1)+" is :"+"D");
            }else{
                System.out.println("Your Grade in Subject "+(i+1)+" is :"+"F");
                isFail=true;
            }

            
        }
        System.out.println();
        if(isFail){
                System.out.println("Final Result: You are Failed!");
            }else{
                System.out.println("Final Result: You are Passed!");
            }
            sc.close();
        


    }
}
