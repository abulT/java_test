public class Sparrow extends Birds{
    private String huntingSkill;

    public Sparrow() {
        huntingSkill = "Lower than eagle";
    }

    public Sparrow(int flyHeight, int speed, int Type, int weight, String huntingSkill) {
        super(flyHeight, speed, Type, weight);
    }

    public String getHuntingSkill() {
        return huntingSkill;
    }

    @Override
    public String toString() {
        return "Sparrow [huntingSkill=" + huntingSkill + "]";
    }

    
}