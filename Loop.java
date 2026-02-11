public class Loop{
    public static void main(String[] a){
        loop(1,50);
        System.out.println("xxxxxxxxx");
        loop(21,35);
    }
    public static void loop(int start, int stop){
        for(;start<=stop;start++){
            System.out.println(start);
        }

    }
}