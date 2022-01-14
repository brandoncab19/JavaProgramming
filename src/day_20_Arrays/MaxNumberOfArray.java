package day_20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 0};
        int max = number[0];

        // shortcut keyword: call the array then type ".fori". hit enter.
        //                                 number.fori --- hit enter.
        //               for a reverse loop ---- .forr --- hit enter
        for (int i = 0; i < number.length; i++) {
             if(number[i] > max){// if there is element in the array that's greater than the current max number
                 max = number[i]; // assigning greater number to variable max
             }


        }

        System.out.println(max);

    }
}
