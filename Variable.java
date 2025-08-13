public class Variable {
    static int a = 2; //static variable
    public static void main(String[] args) {
        int a = 10; //local variable


        System.out.println(a);    //calling a static variable


        System.out.println(Variable.a);  //calling a local variable
    }
    
    
    
}
