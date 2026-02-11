public class Pigeon extends Birds{
    private String hunt;
    private String sound;
    
    public Pigeon(){
        hunt = "better than sparrow";
        sound = "bur gur";
    }

    public String getHunt() {
        return hunt;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "Pigeon [hunt=" + hunt + ", sound=" + sound + ", getHunt()=" + getHunt() + "]";
    }



    
    
}