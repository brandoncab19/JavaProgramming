package Day21_ForEachLoop_ReDo;

import java.util.Arrays;

public class ForEachLoopPractice_5_MergeArray {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length];  // 8
                // inputed a "new" keyword to show this a new array that's empty

        int i = 0; // representing the index number of the third array(students).
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        //using post increment(i++) so in the first index can start with 0
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------");

        char[] ch1 = {'A','B','C','D'}; // 4 elements
        char[] ch2 = {'E','F','G','H'}; // 4 elements

        char[] ch3 = new char[ch1.length + ch2.length]; // 8 elements
        // adding the length of both arrays so we know they'll fit in the third

        int j = 0; // representing the index number of the third array(students).
        for (char eachChar : ch1){
            ch3[j++] += eachChar;
        }
        for (char eachChar : ch2){
            ch3[j++] += eachChar;
        }

        System.out.println(Arrays.toString(ch3));


    }
}
