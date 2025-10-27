
// class Calculator{

//     public int sum(int a,int b){
//         return a+b;

//     }
//     public int sum(int a,int b,int c){
//         return a+b;

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

class Area{
    public int area(int side){
        return side*side;
    }
    public int area(int side1,int side2){
        return side1*side2;
    }
    public double area(double side){
        return side*side*3.14;
    }


}

public class Overloading {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println(obj.area(5));
        System.out.println(obj.area(4,6));
        System.out.println(obj.area(5.0));
    }
    
}
