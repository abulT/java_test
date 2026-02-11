public class MethodOverloading{
    public static void main(String[] a){
        System.out.println(area(5,6));
        System.out.println(area(7,8,6));
    }
    public static int area(int length, int breadth){
        return length*breadth;
    }
    public static double area(int length, int breadth, int height){
        return length + breadth + height;
    }
}
