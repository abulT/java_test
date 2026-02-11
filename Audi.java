public class Audi extends Car1{
    private String brand;

    public Audi(){
        brand = "Audi";
        this.speed = 220;
    }

    public Audi(String brand, String looks, double price, int speed) {
        super(looks, price, speed);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String showInfo() {
        return "Audi [speed=" + speed + ", brand=" + brand + ", looks=" + looks + ", price=" + price + "]";
    }
   
    


    
}