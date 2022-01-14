package Day34_GarbageCollection_AccessModifiers;

import Day30_CustomClass.Dog;
import Day31_Constructors.Student;
import Day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        // Garbage collection is for Non-primitives ONLY

        String str = "Bing Bong"; //After line 7, "Bing Bong" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        System.out.println("------------------------");

        Car car1 = new Car("Nissan", "Skyline", 1994,
                62000,"dark blue");
        car1 = null;

        System.out.println(car1);

        System.out.println("------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ; // two rooms with the same door

        /* Since list2 equals list1, anything that is added or removed from
        either list will be equalivent to the other
         */

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        // both list1 AND list2 hold the same value

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }

}
