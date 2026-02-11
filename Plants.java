public class Plants {
    protected boolean needWater;
    protected boolean needSunlight;
    protected String soilWealth;

    public Plants() {
        this.needWater = true;
        this.needSunlight = true;
        this.soilWealth = "need soil wealth for growth";
    }

    public Plants(boolean needSunlight, boolean needWater, String soilWealth) {
        this.needSunlight = needSunlight;
        this.needWater = needWater;
        this.soilWealth = soilWealth;
    }

    
    public String showInfo() {
        return "Plants [needWater=" + needWater + ", needSunlight=" + needSunlight + ", soilWealth=" + soilWealth + "]";
    }
    
    
}