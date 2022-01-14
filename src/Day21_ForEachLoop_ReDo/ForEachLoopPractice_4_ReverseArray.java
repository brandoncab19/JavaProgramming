package Day21_ForEachLoop_ReDo;

import java.util.Arrays;

public class ForEachLoopPractice_4_ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        int[] reversed = new int[numbers.length];
    // to assure the array has enough of a capacity to contain all the elements
        /*
        reversed[0] = numbers[4];
        reversed[1] = numbers[3];
        reversed[2] = numbers[2];
        reversed[3] = numbers[1];
        reversed[4] = numbers[0];

        System.out.println(Arrays.toString(reversed));

         */

        for (int i = numbers.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));





    }
}
