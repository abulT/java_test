
import java.util.Scanner;

public class Min4{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the type: ");
        int Type = sc.nextInt();
        switch(Type){
            case 1:
                System.out.println("Carnivore");
                break;
            case 2:
                System.out.println("Herbivore");
        }
        Birds v = new Birds();
        Eagle eagle = new Eagle();
        Sparrow s = new Sparrow();
        Pigeon p = new Pigeon();
        System.out.println(eagle.getSpeed());
        System.out.println(eagle.getFlyHeight());
        System.out.println(eagle.getSpeed());
        System.out.println(eagle.getWeight());
        System.out.println(eagle);
        System.out.println(v);
        System.err.println(s);
        System.err.println(p);
        sc.close();
        
        
    }
}