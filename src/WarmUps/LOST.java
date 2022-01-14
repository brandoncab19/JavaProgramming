package WarmUps;

import java.util.Arrays;

public class LOST {
    public static void main(String[] args) {

        int[] numbers = {2,4,6,8,10,12,14};
        
        int[] reverse = new int[numbers.length];

        for (int i = numbers.length-1, j = 0; i >= 0; i--, j++) {
            reverse[j] += numbers[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------");

        int[] num = {14,23,56,75,87,24};
        int evenCount = num.length;
        int oddCount = num.length;
        for (int j : num) {
            if(num[j] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount = " + evenCount);

    }
}

/*
1. Write a program that sort the array of integer in descending order

	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */