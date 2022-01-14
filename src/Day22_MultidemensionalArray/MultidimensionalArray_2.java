package Day22_MultidemensionalArray;

import java.util.Arrays;

public class MultidimensionalArray_2 {
    public static void main(String[] args) {

        // 3 dimensional array contains 2 d arrays

        //                      0         1        2            0             1           2
        int[][][] arr3D = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };
        //                            0                                     1

        //[index num of 2DArray][index num of 1D Array][index number of elements]

        System.out.println(Arrays.deepToString(arr3D));

        //{{10,20,30}, {40,50,60}, {70,80,90}}
        System.out.println( Arrays.deepToString(arr3D[1] ) );

        //{40,50,60}
        System.out.println( Arrays.toString(arr3D[1][1] ) );

        //9
        System.out.println(arr3D[0][2][2]);

        System.out.println("------------------------------");

        for(int[][] each2D  :  arr3D ){
            for(int[] each1D : each2D ){
                for(int element : each1D ){
                    System.out.println(element);
                }
            }
        }



    }
}
