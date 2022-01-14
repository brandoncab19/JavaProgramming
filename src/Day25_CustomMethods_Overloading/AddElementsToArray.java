package Day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        arr = addInt(arr, 10);

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------");

        double[] doubleArray = {1.5,2.5,3.5,4.5};

        doubleArray = addDoubleArr(doubleArray,5.5);

        System.out.println(Arrays.toString(doubleArray));

        System.out.println("-------------------------------");

        String[] str = {"Cydeo","WIll", "Change", "Our"};

        str = addString(str,"Life");

        System.out.println(Arrays.toString(str));

        System.out.println("-------------------------------");

        char[] ch = {'A','B','C','D'};

        ch = addChar(ch,'E');

        System.out.println(Arrays.toString(ch));

    }

    public static int[] addInt (int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0; // using this i since for each loop doesn't have index numbers in the for each loop
        // this can be the index of the variable
        for (int each : array){
            result[i++] = each;
        }

        result[i] = element; // adding the int number given to the new array.

        return result;
    }


    public static double[] addDoubleArr (double[] array, double element){

        double[] resultNewArray = new double[array.length + 1];

        int i = 0; // remains the same as a reg array because it's the index number of the array
        for (double each : array){
            resultNewArray[i++] = each;
        }
    // resultNewArray[resultNewArray.length-1] = element; --- another way of adding the additonal element
        resultNewArray[i] = element;

        return resultNewArray;
    }


    public static String[] addString (String[] array, String element){

        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element;

        return result;
    }


    public static char[] addChar (char[] array, char element){

        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element;

        return result;
    }

}
/*
1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */