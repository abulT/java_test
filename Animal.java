public class Animal{
    private String sound;
    private String sleep;
    private int babies;
    public Animal(){
        sound = "Roar";
        sleep = "zzz";
        babies = 4;
    }

    public Animal(String sound, String sleep, int babies){
        this.sound = sound;
        this.sleep = sleep;
        this.babies = babies;
    }
    public String getsound(){
        return sound;
    }
    public String getsleep(){
        return sleep;
    }
    public int getbabies(){
        return babies;
    }
}
