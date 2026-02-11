public class Reptiles extends Animal1{
    protected String skinType;
    protected boolean backBone;
    protected String egg;

    public Reptiles() {
        this.skinType = "Dry skin";
        this.backBone = true;
        this.egg  = "soft shell";
        this.Height = 6;
        this.Weight = 20;
        this.AnimalType= "Reptile";
        this.Bloodtype = "cold";
    }

    
    public String showInfo() {
        return "Reptiles [Height=" + Height + ", skinType=" + skinType + ", Weight=" + Weight + ", backBone=" + backBone
                + ", AnimalType=" + AnimalType + ", egg=" + egg + ", Bloodtype=" + Bloodtype + "]";
    }
    
     
}