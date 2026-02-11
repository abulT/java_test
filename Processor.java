public class Processor{
    protected String smoothness;
    protected String cacheMemory; 
    protected String model;
    protected int speed;
     public Processor() {
        this.cacheMemory = "50 GB";
        this.model = "11th gen";
        this.smoothness = "Very smooth";
        this.speed = 200;
    }

    public Processor(String cacheMemory, String model, String smoothness, int speed) {
        this.cacheMemory = cacheMemory;
        this.model = model;
        this.smoothness = smoothness;
        this.speed = speed;
    }

    public String getSmoothness() {
        return smoothness;
    }

    
    public String getCacheMemory() {
        return cacheMemory;
    }

   

    public String getModel() {
        return model;
    }

   

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Processor [smoothness=" + smoothness + ", cacheMemory=" + cacheMemory + ", model=" + model + ", speed="
                + speed + "]";
    }
    
   

    
}