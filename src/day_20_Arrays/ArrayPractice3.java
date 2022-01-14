package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); // I want 5 numbers

        if (length <= 0) {
            System.err.println("invalid entry");
            System.exit(0);
        }
        // array needs to have enough capacity to contain all the elements user is going to enter
        int[] numbers = new int[length]; // 0, 0, 0, 0, 0
                        // REMEMBER last index is less than Length
        for (int i = 0; i < length; i++) { // i: starts with 0, 1, 2...
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // ---------------  10, 20, 30...
            //

        }

        System.out.println(Arrays.toString(numbers));

        scan.close();

    }
}
