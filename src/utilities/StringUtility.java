package utilities;

import java.util.Arrays;

public class StringUtility {

    //Give a comment above each method, so you know the function of that method

    //Prints each character of given String
    public static void printEachChar (String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


    }

    //Prints the given String in reverse
    public static String reverseString (String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }


        return result;
    }

    // Check if given String is palindrome
    public static boolean isPalindrome (String str){
        /*
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        boolean checkForPalindrome = result.equalsIgnoreCase(str);

        return checkForPalindrome;

         */
        // Same result, but easier coding. used another method.

        return reverseString(str).equalsIgnoreCase(str);
    }

    //checks if the given string is anagram, returns boolean
    public static boolean isAnagram (String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }

    //checks for strong password
    public static boolean isStrongPassword (String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has uppercase
        boolean r3 = false; // has lowercase
        boolean r4 = false; // has digit
        boolean r5 = false; // has special char

        char[] chars = password.toCharArray();
        for (char each : chars){
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r4 = true;
            } else { // special char
                r5 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        return isStrongPassword;
    }


}
