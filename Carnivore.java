public class Carnivore extends Plants{
    protected String Eatinsects;
    protected String smell;
    public Carnivore(){
        this.Eatinsects = "Small insects";
        this.smell = "fragrance like good";

    }

    public Carnivore(String Eatinsects, String smell, boolean needSunlight, boolean needWater, String soilWealth) {
        super(needSunlight, needWater, soilWealth);
        this.Eatinsects = Eatinsects;
        this.smell = smell;
    }

    @Override
    public String showInfo() {
        return "Carnivore [needWater=" + needWater + ", Eatinsects=" + Eatinsects + ", needSunlight=" + needSunlight
                + ", smell=" + smell + ", soilWealth=" + soilWealth + "]";
    }
    
    
    

}