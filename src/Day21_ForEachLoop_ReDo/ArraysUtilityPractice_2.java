package Day21_ForEachLoop_ReDo;

import java.util.Arrays;

public class ArraysUtilityPractice_2 {
    public static void main(String[] args) {

        String[] students = {"Lisa","Monique","Janila","Lynda","Silvia","Roxxane"};
        String[] earlyBirds = Arrays.copyOf(students, 4);// excludes last index
            // element starts from 1
            //Call the Array: Arrays. ------ before assigning any method

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("-------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(numbers));

        numbers = Arrays.copyOf(numbers, 4);
        // managing one array.

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------");
        //   Manage the array to where it only has elements 'C' to 'G'

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        ch1 = Arrays.copyOfRange(ch1, 2, 7);
                    // excludes last index so remember to add 1. ( 7+1 OR 8)
        // excludes the last index number given(7 - 1 = 6). so will 6 will be printed, not 7

        System.out.println(Arrays.toString(ch1));

        System.out.println("-------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index numbers 0    1   2   3   4   5   6   7   8   9
        int[] secondArray = Arrays.copyOfRange(scores,3,8); // excludes 90 - gives you 80
                    //Since the last index number is ecluded. we give 1 extra

        int[] thirdArray = Arrays.copyOfRange(scores,4, 10);

        System.out.println(Arrays.toString(secondArray));
    }
}
