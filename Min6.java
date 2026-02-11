import java.util.Scanner;
public class Min6{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Plants p = new Plants();
        System.out.println(p.showInfo());
        Herbivore h = new Herbivore();
        System.out.println(h.showInfo());
        Carnivore c = new Carnivore();
        System.out.println(c.showInfo());
        Mango m = new Mango();
        System.out.println(m.showInfo());
        VenusFly v = new VenusFly();
        System.out.println(v.showInfo());       
    }
}