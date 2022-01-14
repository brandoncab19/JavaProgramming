package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Intro {
    public static void main(String[] args) {
    // MUST specify the datatype
                                // datatype is optional here
        ArrayList <Integer> numbers = new ArrayList<Integer>();

        ArrayList <String> names = new ArrayList<>();

        // no need to call the .toString method when printing the ArrayList
        System.out.println(names);
        System.out.println(numbers);

    }
}
