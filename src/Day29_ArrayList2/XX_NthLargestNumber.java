package Day29_ArrayList2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class XX_NthLargestNumber {
    public static void main(String[] args) {
    /* write a program that can return the largest number(n) of the
    given position(1st,2nd,3rd, etc..) from an arraylist
     */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 5; // find the 3rd largest number

        for (int i = 1; i < n; i++) {
            // starting i with 1 and removing the 1st and 2nd largest number
            list.removeIf(p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);

        System.out.println("max = " + max);


    }
}
