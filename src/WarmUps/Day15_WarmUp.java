package WarmUps;

import java.util.Scanner;

public class Day15_WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.next();
        
        word = word.replaceFirst("x", "");

        System.out.println("word = " + word);

        System.out.println("---------------------------");

        System.out.println("Enter two words: ");
        System.out.println("Word 1 = ");
        String word1 = scan.next();
        System.out.println("Word 2 = ");
        String word2 = scan.next();






    }
}

/*
3. Ask user to enter a word. If the work starts with x, print the
word without x.
    Input:
        xcode
    Output:
        code
 */

/*
4. Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the
last letter is the same,
print that character once.

    Input:
        one
        eight
    Output:
        oneight

 */