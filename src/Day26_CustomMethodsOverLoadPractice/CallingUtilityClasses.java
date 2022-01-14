package Day26_CustomMethodsOverLoadPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class CallingUtilityClasses {
    public static void main(String[] args) {

        int[] num = {2,2,2,4,3,3,3,6};

        int[] unique = ArraysUtility.uniqueElement(num);

        System.out.println(Arrays.toString(unique));

        System.out.println("------------------------------------");

        int[] num2 = {2,3,5,2,6,8,};
        int index = 4;

        int[] result = new int[num2.length-1];

        int j = 0; // representing the index of the new array(result)

        for (int i = 0; i < num2.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = num2[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------------");

        int[] nums1 = {2,3,4,5};
        int[] nums2 = {6,7,8,9};

        int[] nums3 = ArraysUtility.merge2Arrays(nums1,nums2);

        System.out.println(Arrays.toString(nums3));

        System.out.println("------------------------------------");

        int[] number = {20,40,60,80,100};

        int[] result2 = ArraysUtility.reverseArray(number);

        System.out.println(Arrays.toString(result2));

        System.out.println("------------------------------------");

        int[] bigNumbers = {16,12,12,13,4,4,4,13};

        int[] result3 = ArraysUtility.removeDuplicates(bigNumbers);

        System.out.println(Arrays.toString(bigNumbers));
    }
}
