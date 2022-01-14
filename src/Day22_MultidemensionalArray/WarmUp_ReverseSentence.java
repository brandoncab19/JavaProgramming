package Day22_MultidemensionalArray;

import java.util.Arrays;

public class WarmUp_ReverseSentence {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";

        String[] words = str.split(" ");

        String reversed = "";

        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";

        }
        System.out.println(reversed);

        System.out.println("--------------------------");

        String str2 = "I Love Java";

        String[] words2 = str2.split(" ");

        String reverse = "";

        for (int i = words2[1].length()-1; i >= 0; i--) {
              reverse += words2[1].charAt(i);
        }

        System.out.println(reverse);

        words2[1] = reverse;
        String result = "";

        for (String s : words2) {
            result += s + " ";
        }
        System.out.println(result);
    }
}

/*
warmup task:
	1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */