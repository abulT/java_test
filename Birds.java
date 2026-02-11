public class Birds{
    private int flyHeight;
    private int weight;
    private int speed;
    private int Type;
    public Birds(){
        flyHeight = 200;
        weight = 12;
        speed = 120;
        
    } 

    public Birds(int flyHeight, int speed, int Type, int weight) {
        this.flyHeight = flyHeight;
        this.speed = speed;
        this.Type = Type;
        this.weight = weight;
    }
      

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getType() {
        return Type;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    @Override
    public String toString() {
        return "Birds [flyHeight=" + flyHeight + ", weight=" + weight + ", speed=" + speed + ", toString()="
                + super.toString() + "]";
    }

    
} 