public class Lambohini extends Car1{
    private String style;

    public Lambohini() {
        style = "Very fantastic";
        this.speed = 300;
        
    }

    public Lambohini(String style, String looks, double price, int speed) {
        super(looks, price, speed);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String showInfo() {
        return "Lambohini [speed=" + speed + ", style=" + style + ", looks=" + looks + ", price=" + price + "]";
    }

    
    
    
}