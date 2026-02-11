
import java.util.ArrayList;

public class Min7{
    public static void main(String[] b){
        ArrayList<Car1> cars = new ArrayList<>();
        Car1 car = new  Car1();
        Car1 audi = new Audi();
        Car1 lambohini = new Lambohini();
        cars.add(car);
        cars.add(audi);
        cars.add(lambohini);
        ListCars(cars);
        
        

    }
    private static void ListCars(ArrayList<Car1> cars){
        for(Car1 car : cars){
            System.out.println(car.showInfo());
        }
    } 
}