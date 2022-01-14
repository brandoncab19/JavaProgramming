package Day20_Arrays_ReDo;

import java.util.Arrays;

public class ArraysPractice_1 {
    public static void main(String[] args) {

        int[] numbers = {10, 87, 3, 70}; // size of Array: 4
        // index number of Array: 3

        // System.out.println(numbers[3-1]); - Calling a particular element
        System.out.println(Arrays.toString(numbers)); // - printing the entire Array into a String

        Arrays.sort(numbers); // Will sort the arrays in ascending order
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------");
        // create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[1] = 85; // 2nd element [0,85,0,0,0]
        scores[scores.length - 1] = 95; // calling the last element with .length
        // equivalent to scores[4] =
        scores[0] = 65;
        scores[2] = 55;
        scores[3] = 70;

        System.out.println(Arrays.toString(scores));
        // - [0,0,0,0] default value printed when not adding an element to an Integer.

        System.out.println("---------------------");
        // months of the year. try it with a loop

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep",
                "Oct", "Nov", "Dec"};

        for (int i = 0; i < months.length; i++) {
            // System.out.println(Arrays.toString(months));
            // this print out above will print out the elements the amount of times in the loop
            System.out.print(months[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        for (int i = months.length - 1; i > 0; i--) {
            System.out.print(months[i] + " ");
        }


    }
}
