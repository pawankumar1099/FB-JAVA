
// class Calculator{

//     public int sum(int a,int b){
//         return a+b;

//     }
//     public int sum(int a,int b,int c){
//         return a+b+c;

//     }
//     public double sum(double a,double b){
//         return a+b;

//     }
// }
// public class Overloading {

//     public static void main(String[] args) {

//         Calculator s = new Calculator();
//         System.out.println(s.sum(1, 2));
//         System.out.println(s.sum(1, 2,3));
//         System.out.println(s.sum(1.0, 2.0));
        
//     }
// }


//Create a method deposit in class name bank overload this method take user balance and withdrawal show current balance after withdrawal
//Create a method price overloaded selling price after discount, selling price - 40% discount, selling price, discount,exchnge bonus

// class FinalPrice{

//     public float price(float p){

//         float temp = (40/100)*p;

//         return  p-temp;
//     }

//     public float price(float p,float d){

//         float temp = (d/100)*p;

//         return  p-temp;
//     }
//     public float price(float p,float d,float e){

//         float temp = (d/100)*p;

//         return  p-temp+e;
//     }

// }

// public class Overloading {

//     public static void main(String[] args) {
//         FinalPrice s = new FinalPrice();
//         System.out.println(s.price(100));
//         System.out.println(s.price(100,10));
//         System.out.println(s.price(100,10,10));
//     }
    
// }


 class abc {
    void process(int a , float b){
        System.out.println("Method 1"+a+" "+b);
    }
    void process(float a , int b){
        System.out.println("Method 2"+a+" "+b);
    }
    

}

public class Overloading {

    public static void main(String[] args) {
        abc s =new abc();
        s.process(10f,10); //ambiguity error 
    }

}

// class Bank{

//     public void showBalance(int balance, int withdraw){
//         int newBalance =  balance-withdraw;
//         if(newBalance<0){
//             System.out.println("Transaction is not Possible!");
//         }else{
//             System.out.println("New Balance : "+newBalance);
//         }
//     }

// }




// public class Overloading {
//     public static void main(String[] args) {

//         Bank s = new Bank();
//         s.showBalance(1000, 500);
        
//     }
// }

// class Area{
//     public int area(int side){
//         return side*side;
//     }
//     public int area(int side1,int side2){
//         return side1*side2;
//     }
//     public double area(double side){
//         return side*side*3.14;
//     }


// }

// public class Overloading {
//     public static void main(String[] args) {
//         Area obj = new Area();
//         System.out.println(obj.area(5));
//         System.out.println(obj.area(4,6));
//         System.out.println(obj.area(5.0));
//     }
   
// }

