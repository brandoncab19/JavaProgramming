package Day20_Arrays_ReDo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice_5_Min_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
       // each number user enters will be assigned to the indexes of the array numbers
        }

        int max = numbers[0];
        // assume its index 0 first then check the remaining indexes
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
