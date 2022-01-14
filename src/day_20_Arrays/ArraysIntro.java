package day_20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // Arrays is set as seen below only when you know the amount of elements, but don't know the data.
        String[] myGroup = new String[5];

        /*
            default value when not assigned
        byte, short, int, long, double, float = 0
                                       String = null
         */

        // System.out.println(myGroup); // INCORRECT. this is a hashcode
        // System.out.println(Arrays.toString(myGroup)); use this print to print array as a String

        myGroup[0] = "John";
        myGroup[1] = "Tommy";
        myGroup[2] = "Chucky";
        myGroup[3] = "Dwayne";
        myGroup[4] = "Teremana";

        Arrays.sort(myGroup);
//     Sorting the elements in an acending order(small to large) when you print(0 - 9, a to z, etc...)

        System.out.println(Arrays.toString(myGroup));
//     Array will not print on its own(implicitly) must convert to String using "toString()" method

        System.out.println("----------------------------------");

        // Arrays is set as seen below only when you know the amount of elements and the data in it
        String[] days = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        // Index numbers    0      1      2       3       4      5      6
        System.out.println(Arrays.toString(days));

        int num = 5;

        if(num < 1 || num > 7);{
        System.err.println("invalid number");
        System.exit(0);
        }
        System.out.println(days[num-1]); // check index for referance

    }
}
