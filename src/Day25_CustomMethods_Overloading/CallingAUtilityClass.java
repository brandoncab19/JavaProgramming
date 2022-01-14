package Day25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class CallingAUtilityClass {
    public static void main(String[] args) {

        String str = "Jazzy Hands";

        // call the utility class. then the custom method you wanna use
        StringUtility.printEachChar(str);

        System.out.println("--------------------");

        String str2 = "Wooden Spoon";

       String result = StringUtility.reverseString(str2);

        System.out.println(result);

        System.out.println("--------------------");

        String str3 = "Anna";

        boolean palindrome = StringUtility.isPalindrome(str3);

        System.out.println(palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

        System.out.println("-----------------------------------------");


        double[] dec = {2.3,6.5,1.2,4.9};

        ArraysUtility.eachElement(dec);

        System.out.println();

        double maxdec = ArraysUtility.maxNum(dec);
        System.out.println(maxdec);

        System.out.println("-----------------------------------------");

        int[] num = {32,43,12,67,45,78,43};

        int max = ArraysUtility.maxNum(num);

        System.out.println(max);

        System.out.println("-----------------------------------------");
        
        String[] setList = {"tonight", "not enough", "fast car"};
        
        boolean answer = ArraysUtility.contains(setList, "more things to say");

        System.out.println("answer = " + answer);
    }
}
