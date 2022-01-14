package Day22_MultidemensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // index of the elements:  0 1 2     0 1 2 3    0 1  2 3  4
        int[][] arr2 = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2

        for (int[] each1DArry : arr2) { // pulling the arrays
            // will loop 3 times because there are only 3 arrays present.

            System.out.println(Arrays.toString(each1DArry));

            for (int eachElement : each1DArry) { // pulling the elements
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }

    }
}
