package Day20_Arrays_ReDo;

import java.util.Arrays;

public class ArraysPractice_2 {
    public static void main(String[] args) {
        // A to Z using Arrays

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        for(char i = 'A', j = 0;i <= 'Z' && j < letters.length; i++, j++){
            letters[j] = i; // j represents the index number
                          // i represents the element
            // System.out.println(letters[j]); // Each char of the Array
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------------");
          // print alphabet from 'Z' to 'A' using Array(starting from 0) and loop
        char[] alphabet = new char[26];
        /*
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
         */

        for(char i = 'Z', j = 0; i >= 'A' && j < alphabet.length; i--, j++) {
             alphabet[j] = i;
        }
        System.out.println(Arrays.toString(alphabet));

        /*
        char ch = 'Z';
        for(int i = 0; i < alphabet.length; i++, ch-- ){
            alphabet[i] = ch;
         */

    }
}
