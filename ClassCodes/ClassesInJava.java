class Student{

    String name = "pawan";
    int Roll = 48;
    int year;

    public  void message(){
        System.out.println("I am a Student!");
    }
    static void display(){
        System.out.println("this is a message");
    }


    
}



public class ClassesInJava {
    public static void main(String[] args) {

        Student s = new Student();
        s.message();
        System.out.println(s.name);
        System.out.println(s.Roll);
        s.year=2025;
        System.out.println(s.year);
        Student.display();
        
    }
}

