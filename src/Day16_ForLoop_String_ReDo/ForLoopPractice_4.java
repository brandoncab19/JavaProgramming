package Day16_ForLoop_String_ReDo;

import java.util.Scanner;

public class ForLoopPractice_4 {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
// index number ----> 01234567....
        String result = "";
        // This "result" variable will contain the reverse string of str

        /* Manually adding each string from left to right without a loop
        result += str.charAt(11);
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        */

        // char c1 = str.charAt(str.length()-1); // n
        // how to get the last character of any String.

        for (int i = str.length()-1; i >= 0; i--) { // i = Last index number in string. starting right to left
            result += str.charAt(i);
            /*
             After the index of the string is pulled we get index numbers, then we
             call the string back using .charAt() and adding to the (previously made)result variable
            */
        }


        System.out.println(result);
        /*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */

        System.out.println("------------------------------");
            /* Reverse a string and see if is a Palindrome. Palindrome is a word that is
            the same when spelled in reverse
             */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word to see if its a Palindrome");

        String word = scan.next();

        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        /*
        Boolean isPalindrome = reverse.equalsIgnoreCase(word);
        System.out.println("isPalindrome = " + isPalindrome);
        */ // Another way of finding the solution

        if(reverse.equalsIgnoreCase(word)) {
            System.out.println(reverse + " = is a Palindrome");
        }else {
            System.out.println(reverse + " = is not a Palindrome");
        }
        scan.close();


    }
}

/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */