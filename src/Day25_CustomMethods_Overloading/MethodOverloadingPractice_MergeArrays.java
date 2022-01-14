package Day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingPractice_MergeArrays {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {7,8,9,10};

       int[] array3 = mergeArrays(array1,array2);

        System.out.println(Arrays.toString(array3));

        

    }

    public static int[] mergeArrays(int[] arry1, int[] arry2){

        int[] result = new int[arry1.length + arry2.length];

        int i = 0;
        for (int each : arry1){
            result[i++] = each;
        }

        for (int each : arry2){
            result[i++] = each;
        }

        return result;
    }

    public static double[] mergeArrays(double[] arry1, double[] arry2){

        double[] result = new double[arry1.length + arry2.length];

        int i = 0;
        for (double each : arry1){
            result[i++] = each;
        }

        for (double each : arry2){
            result[i++] = each;
        }

        return result;
    }

    public static char[] mergeArrays(char[] arry1, char[] arry2){

        char[] result = new char[arry1.length + arry2.length];

        int i = 0;
        for (char each : arry1){
            result[i++] = each;
        }

        for (char each : arry2){
            result[i++] = each;
        }

        return result;
    }

    public static String[] mergeArrays(String[] arry1, String[] arry2){

        String[] result = new String[arry1.length + arry2.length];

        int i = 0;
        for (String each : arry1){
            result[i++] = each;
        }

        for (String each : arry2){
            result[i++] = each;
        }

        return result;
    }

}

/*
1. create a method that can merge two integer arrays.
	2. create a method that can merge two double arrays.
	3. create a method that can merge two char arrays.
	4. create a method that can merge two String arrays.
 */