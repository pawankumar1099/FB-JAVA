class Car{
    private String brand;
    private String model;
    private int price;

    public void setBrand(String n){
        brand=n;
    }
    public void setPrice(int n){
        price=n;
    }
    public void setModel(String n){
        model=n;
    }

    public int getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
}

public class CarEncapsulation {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Alto");
        c.setBrand("Maruti");
        c.setPrice(400000);

        System.out.println(c.getBrand());
        System.out.println(c.getModel());
        System.out.println(c.getPrice());
        
    }
}
