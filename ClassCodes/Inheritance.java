class Vehicle{
    public void start(){
        System.out.println("Vehicle is Starting");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts without key or button");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts without button");
    }
}
public class Inheritance {
    
    public static void main(String[] args) {
        Car s = new Car();
        s.start();
        
    }
}
//overload method area to compute area of square, rectangle, circle.
