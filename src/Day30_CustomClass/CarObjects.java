package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carInfo("Nissan", "Skyline GT-R", "Gray",
                1994, 89999.99);

        Car car2 = new Car();
        car2.carInfo("Deloreon", "one type", "Silver",
                1982, 46000.00);

        Car car3 = new Car();
        car3.carInfo("Audi", "Q7", "Red", 2019,
                40000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.start();
        car2.start();
        car1.drive();
        car2.drive();
        car2.stop();

        // Car[] myCars = {car1, car2, car3};
        // can't add/remove new cars to the array. it's fixed. limited

        ArrayList <Car> myCars = new ArrayList<>();
        myCars.addAll(Arrays.asList(car1, car2, car3));

            // calling each of the objects. Car
        for (Car each : myCars) {
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("--------------------------------");
            // All Nissan cars that from 1990 to 2005 need recall

        myCars.removeIf(p-> p.brand.equalsIgnoreCase("nissan") && p.year <=2005);

        System.out.println(myCars);


    }
}
