
import java.util.Scanner;

public class Factorial{
    public static void main(String[] a){
         Scanner d = new Scanner(System.in);
         int n = d.nextInt();
         int x = d.nextInt();
         for (int i =1;i<=n;i++) {
             x=x*i;
             
         }   
         System.err.print(x+" ");   
    }
}