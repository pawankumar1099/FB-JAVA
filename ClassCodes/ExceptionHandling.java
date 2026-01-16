// class Account{
//     private double balance;
//     public void deposit(double amount){
//         if(amount<=0){
//             throw new IllegalArgumentException("Deposit amount is must be Greater than 0");
//         }

//         balance+=amount;

//         System.out.println("Deposited: "+amount);
//     }

//     public void withdraw(double amount) throws Exception{
//         if(amount<=0){
//             throw new IllegalArgumentException("Withdraw amount must be greater than 0");
//         }else if(amount>balance){
//             throw new Exception("Insufficient Balance");

//         }else{
//             balance -= amount;
//             System.out.println("Withdraw: "+amount);
//         }

//     }

//     public double getBalance(){
//         return balance;
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {

//         Account a = new Account();
        
//         try {
//             a.deposit(0);
//             a.withdraw(0);

//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }finally{
//             System.out.println("Balance:" + a.getBalance());
//         }
        
//     }
// }


//write a program to take marks as input from the user if the marks are less than 0 or greater than 100 throw the exception invalid marks exception otherwise display the grade

class Marks{

    private int totalMarks;

    void setMarks(int marks) throws Exception{

        if(marks>100 || marks<0){
            throw new Exception("Marks Should in Range of 1 - 100");
        }

        totalMarks=marks;
    }

    void showBalance(){
        System.out.println("Balance is: "+totalMarks);
    }



}

public class ExceptionHandling {
    public static void main(String[] args) {
        Marks m = new Marks();

        try {
            m.setMarks(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            m.showBalance();
        
    }
    
}
}