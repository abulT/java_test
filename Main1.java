public class Main1{
    public static void main(String[] args) {
        Laptop l = new  Laptop();
        System.out.println(l);
        Processor p = new Processor();
        System.out.println(p.getSpeed());
        Graphicscard g = new Graphicscard();
        System.out.println(g);
        Laptop l2 = new Laptop("16GB" ,"1 TB",g, "Excellance",p, "16.5 inch");
        System.out.println(l2);
    }
}