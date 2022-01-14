package day_21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("--------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4);
// copys the element of the array form the first element to the given number. Results with a new Array

        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );
/*
 copys the elements from the first element GIVEN to the last element GIVEN(last element(index) is
 excluded). results give you a new array
 */

        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores,3, 7+1);



    }
}
