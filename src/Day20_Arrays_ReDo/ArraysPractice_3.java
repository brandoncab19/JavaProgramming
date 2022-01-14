package Day20_Arrays_ReDo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?:");
        int length = scan.nextInt(); // 10 for example

        if(length <= 0){
            System.err.println("Stoopid. Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; // [0,0,0,0..]
        //array needs to have enough capacity to contain all the elements user going to enter

        for (int i = 0; i < length; i++) {
            System.out.println("enter a number:");
            numbers[i] = scan.nextInt();
            //each input user provided during each execution of the loop, will be assigned to the indexes of the array
        }

        scan.close();
        System.out.println(Arrays.toString(numbers));

    }
}
