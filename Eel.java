public class Eel extends Fish{
    private String charge;

    public Eel() {
        super();
        this.charge = "electric shock";
        this.Height = 5;
        this.Weight = 7; 
    }

    @Override
    public String showInfo() {
        return "Eel [Height=" + Height + ", charge=" + charge + ", LiveWater=" + LiveWater + ", Weight=" + Weight
                + ", Gills=" + Gills + ", AnimalType=" + AnimalType + ", Bloodtype=" + Bloodtype + "]";
    }
    
    
}