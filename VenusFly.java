public class VenusFly extends Carnivore{
    private String danger;
    public VenusFly(){
        danger = "very danger";
    }

    public VenusFly(String Eatinsects, String smell, boolean needSunlight, boolean needWater, String soilWealth) {
        super(Eatinsects, smell, needSunlight, needWater, soilWealth);
    }

    @Override
    public String showInfo() {
        return "VenusFly [needWater=" + needWater + ", danger=" + danger + ", Eatinsects=" + Eatinsects
                + ", needSunlight=" + needSunlight + ", smell=" + smell + ", soilWealth=" + soilWealth + "]";
    }

    
    }
