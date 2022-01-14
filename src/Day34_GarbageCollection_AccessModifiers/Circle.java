package Day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    /* when setting up static variables. if the variable requires more than
    one step to find the value, you MUST find the value in the static block.
     */
    // public static ArrayList<Integer> numbers;
        // requires more than one step to get the value


    public Circle(double radius){// Conductor is ONLY meant for instances
        this.radius = radius;
        // pi = 3.14; NOT RECOMMENDED
    }

    static{
     //static block only accept static variables. Instance variables NOT allowed
//Tip: Make it a habit to always set the static variable and value in the static block
        pi = 3.14;
        name = "Cirlce";


    }


}
