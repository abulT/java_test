public class Eagle extends Birds{
    private String skill;
    public Eagle(){
        skill = "Outstanding";
    }
    public Eagle(int flyHeight, int weight, int speed, String type, String skill){
        super();

    }
    public String skill(){
        return  skill;
    }
    @Override
    public String toString() {
        return "Eagle [toString()=" + super.toString() + "]";
    }
}