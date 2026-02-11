import java.util.*;
public class Trailingzeroes{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        System.out.println(count);
        }
    }
