class Bike{
    private String engine;
    private String driver;
    public int doors;

    public String getengine(){
        return engine;
    }
    public void setengine(String engine){
        this.engine = engine;
    }
    public String getdriver(){
        return driver;
    }
    public void setdriver(String driver){
        this.driver = driver;
    }
    public String run(){
        if((engine.equals("fixed")) && (driver.equals(" not seated")) ){
            return "running";
        }
        else{
            return "not running";
        }
    }
}
public class Main2{
    public static void main(String[] args) {
    Bike bike = new Bike();
    bike.doors = 1;
    bike.setengine("fixed");
    bike.setdriver("seated");
    System.out.println(bike.doors);
    System.out.println(bike.getdriver());
    System.out.println(bike.getengine());
    System.out.println(bike.run());
}

}
