package day_16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "otto";
        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);

        }

        boolean isPalindromme = word.equalsIgnoreCase(reversed);

        System.out.println("is Palindrome = " + isPalindromme);
        System.out.println(reversed);
    }
}
