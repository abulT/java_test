public class Car1 {
    protected  int speed;
    protected String looks;
    protected double price;

    public Car1() {
        this.looks = "perfect";
        this.price = 500000;
        this.speed = 200;
    }

    public Car1(String looks, double price, int speed) {
        this.looks = looks;
        this.price = price;
        this.speed = speed;
    }

    
    public String showInfo() {
        return "Car1 [speed=" + speed + ", looks=" + looks + ", price=" + price + "]";
    }
    
    

}
