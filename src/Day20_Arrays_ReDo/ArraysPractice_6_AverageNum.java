package Day20_Arrays_ReDo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice_6_AverageNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will you like to enter?:");
        int length = scan.nextInt();

        if(length < 0){
            System.err.println("Invalid entry!");
            System.exit(0);
        }
        int[] numbers = new int[length];
        double sum = 0; // double in case the average is a decimal

        for (int i = 0; i < length; i++) {
            System.out.println("Enter your number:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
            double avgNumber = sum/numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println("avgNumber = " + avgNumber);
    }
}
