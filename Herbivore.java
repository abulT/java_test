public class Herbivore extends Plants{
    protected String manure;
    protected String height;
    public Herbivore(){
        manure = "cow dung";
        height = "50m";
    }

    public Herbivore(String height, String manure, boolean needSunlight, boolean needWater, String soilWealth) {
        super(needSunlight, needWater, soilWealth);
        this.height = height;
        this.manure = manure;
    }

    @Override
    public String showInfo() {
        return "Herbivore [needWater=" + needWater + ", manure=" + manure + ", needSunlight=" + needSunlight
                + ", height=" + height + ", soilWealth=" + soilWealth + "]";
    }
    
}