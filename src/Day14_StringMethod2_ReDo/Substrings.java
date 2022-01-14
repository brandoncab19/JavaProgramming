package Day14_StringMethod2_ReDo;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        String word = "Cydeo School";
        //             0123456789...
     // String  brand = word.substring(0, 5); --> Just another way of getting the ending index
        String brand = word.substring(0, 4+1);// .substring() must be assigned to a new String
/*
 .substring(beginning index, ending index) grabs specific indexes from the string.
 the ending index number assigned will ALWAYS be excluded. to assure it's printed,
 give the ending index a +1
 Assign to new variable.
 -----Substring means, small portion of the string.-----
 */
        System.out.println(brand);

        String str1 = word.substring(6);
        // no need for ending index if you're getting the remaining characters

        System.out.println(str1);

        System.out.println("-----------------------------------");
                    // Lets separate each word from the string...

        String word2 = "Java Progamming Language";

        String firstWord = word2.substring(0, word2.indexOf(" "));
        String secondWord = word2.substring(word2.indexOf(" ")+1, word2.indexOf("g ")+1);
        String thirdWord = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("firstWord = " + firstWord);
        System.out.println("secondWord = " + secondWord);
        System.out.println("thirdWord = " + thirdWord);

        System.out.println("-----------------------------------");
                   // pull the domain from the given email.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = scan.nextLine();

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);

        scan.close();

        System.out.println("-----------------------------------");

        String str = "Java is Fun, Java is cool";
        //            0123456789...
        String s1 = str.substring(0, 11);
        String s2 = str.substring(str.indexOf(" J"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------------");






    }
}
