
import java.util.Scanner;

public class Methods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        area(8);
        areaOfrect(4,6);
    }
public static void area(int side){
    System.out.println("Area: "+side*side);
}
public static void areaOfrect(int length,int breadth){
    System.out.println("AreaOfRectangle: "+length*breadth);
    
}
    
}