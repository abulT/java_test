public class Mango extends Herbivore{
    private String produce;

    public Mango(){
        this.produce = "Mangoes";

    }

    public Mango(String produce) {
        this.produce = produce;
    }

    public Mango(String produce, String height, String manure, boolean needSunlight, boolean needWater, String soilWealth) {
        super(height, manure, needSunlight, needWater, soilWealth);
        this.produce = produce;
    }

    @Override
    public String showInfo() {
        return "Mango [needWater=" + needWater + ", produce=" + produce + ", manure=" + manure + ", needSunlight="
                + needSunlight + ", height=" + height + ", soilWealth=" + soilWealth + "]";
    }
    
}