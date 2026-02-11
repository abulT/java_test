public class Animal1{
    protected float Height;
    protected float Weight;
    protected String AnimalType;
    protected String Bloodtype;

    public Animal1() {
        this.Height = 0;
        this.Weight = 0;
        this.AnimalType = "unknown";
        this.Bloodtype = "unknown";
    }

    
    public String showInfo() {
        return "Animal1 [Height=" + Height + ", Weight=" + Weight + ", AnimalType=" + AnimalType + ", Bloodtype="
                + Bloodtype + "]";
    }
    
    
    
}