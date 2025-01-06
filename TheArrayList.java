import java.util.*;

public class TheArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Benz");
        cars.add("BMW");
        cars.add("Toyota");
        System.out.println("List of cars: " + cars );
        cars.clear();
        System.out.println(cars);
    }
}
