public class Vehicle{
    private int doors;
    private  int fuel;
    private String engine;
    private String light; 

    public Vehicle(){
        doors = 4;
        fuel = 5;
        engine = "Assemble";
        light = "QLED";
    }
    public int getdoors(){
        return doors;
    }
    public int getfuel(){
        return fuel;
    }
    public String engine(){
        return engine;
    }
    public String getlight(){
        return light;
    }
}