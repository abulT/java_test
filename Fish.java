public class Fish extends Animal1{
    protected  boolean  LiveWater;
    protected boolean  Gills;

    public Fish() {
        this.AnimalType = "Fish";
        this.LiveWater = true;
        this.Gills = true;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fish{");
        sb.append("LiveWater=").append(LiveWater);
        sb.append(", Gills=").append(Gills);
        sb.append('}');
        return sb.toString();
    }
    
    
}