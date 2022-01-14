package Day13_StringMethods;

import java.util.Scanner;

public class StringMethod_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Whats your full name: ");

        String firstName = scan.next();
        String lastName = scan.next();

        System.out.println("Initials = " + firstName.charAt(0) + "." + lastName.charAt(0) + ".");
/* CharAt(index) : Returns the character at the given index, index is given, and returns a char
           EX: "Wooden"
      index --> 012345
      charAt(0) = 'W';
      charAt(3) = 'd';
 */

        System.out.println("--------------------------------");

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = f + "." + l + ".";
/*  When you wanna concatenate any value of any variable to a String, remember to add double quotes("") in the concatenation
    Another way of solving this task
 */

        System.out.println("initials = " + initials);

        scan.close();

        System.out.println("--------------------------------");

        String s1 = "Today was a great for java";

        int totalChar = s1.length();
// .length ---> Gives you the total NUMBER of characters. returns to you an int

        System.out.println("number of Characters: " + totalChar);

        System.out.println("--------------------------------");

     // char lastChar = s1.charAt(totalChar-1);    // Another option on finding the last character
        char lastChar = s1.charAt(s1.length()-1);
                            // We subtract 1(-1) to get the last character
        /*
         If the amount of characters is 6.. "BigBoy"
         the length() of the index will be 6(counting the first character as 1)
         but the index number will be 5 (because the count instead will start from 0)

         Index number = length()-1
         */

        System.out.println(lastChar);
    }
}
