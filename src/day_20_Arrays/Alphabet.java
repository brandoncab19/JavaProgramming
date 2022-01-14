package day_20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];  //Z~A
        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */

        /*
        char ch = 'Z';
        for(int i = 0; i < alphabets.length; i++, ch-- ){
            alphabets[i] = ch;
        }
*/

/*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }

*/


        System.out.println(Arrays.toString(alphabets)); // to print the whole array
        // System.out.println(alphabet[3]); // to print the element(just one) of the array






    }
}
