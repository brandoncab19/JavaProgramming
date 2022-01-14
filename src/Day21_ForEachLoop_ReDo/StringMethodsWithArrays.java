package Day21_ForEachLoop_ReDo;

import java.util.Arrays;

public class StringMethodsWithArrays {
    public static void main(String[] args) {

        String word = "Wooden";
        char[] ch = word.toCharArray();

        System.out.println(Arrays.toString(ch));

        for (char each : ch){
            System.out.println(each);
        }
        System.out.println("-------------------------");

        String str1 = "acdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);

        System.out.println("------------------------------");

        String sentence = "I love and miss playing my acoustic guitar";

        String[] eachWord = sentence.split(" ");
        // splits, creates a new element, and removes the given string in the .split method

        System.out.println(Arrays.toString(eachWord));


    }
}
