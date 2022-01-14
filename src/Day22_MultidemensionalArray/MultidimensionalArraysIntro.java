package Day22_MultidemensionalArray;

import java.util.Arrays;

public class MultidimensionalArraysIntro {
    public static void main(String[] args) {


        String[] group1 = {"Joey","Ross","Chandler"};
        String[] group2 = {"Rachel","Pheobe", "Monica", "Jannis"};
        String[] group3 = {"John","Adam","Mike"};

        String[][] groups = new String[3][];

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("----------------------------------------------");
    // index of elements:  0, 1, 2, 3....  0  1  2  3... 0  1  2  3  4
        int[][] arr2D = {{23,43,54,22,12},{12,46,14,26},{35,43,21,67,13}};
   //index of arrays:          0             1               2

        System.out.println(Arrays.deepToString(arr2D));
        //How to look for and print an entire multi-dimensional array

        System.out.println(Arrays.toString(arr2D[1]));
        //How to look for and print a single dimensional array

        System.out.println(arr2D[2][3]);
        // How to look for and print a specific array and element in the array

        System.out.println("----------------------------------------------");

        // index of the elements:  0 1 2     0 1 2 3    0 1  2 3  4
        int[][] arr2 = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2


        for(int i=0; i < arr2.length; i++) { //i: index numbers of single dimensional arrays
           // System.out.println(Arrays.toString(arr2[i]) );

            for (int j = 0; j < arr2[i].length; j++) { // j: index numbers of the elements in each Array
                System.out.print(arr2[i][j] + " ");
            }

            System.out.println();
            // Add to outer loop to print each array in a new line
            // Just for a cleaner look

        }

        System.out.println("------------------------------------------------");

        int[][] numArr2 = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        for (int h = numArr2.length - 1; h >= 0; h--) { // h: index number of 1D arrays starting from last index to 0

           // System.out.println(Arrays.toString(numArr2[h]));
            //         don't forget the [] below so the full element can be pulled with the array
            for (int k = 0; k < numArr2[h].length; k++) { //j: index number of elements starting from 0 to last index
                System.out.print(numArr2[h][k] + " ");
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------");

        int[][] bunchaNumbers = {{2,4,6,8,10},{12,14,16,18,20},{22,24,26,28,30}};

        for (int b = 0; b < bunchaNumbers.length; b++) {
           // System.out.println(Arrays.toString(bunchaNumbers[b]));

            for (int c = bunchaNumbers[b].length - 1; c >= 0; c--) {
                System.out.print(bunchaNumbers[b][c] + " ");
            }

            System.out.println();

        }

    }
}
