package PracticePackage;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "I lovelove dogsdogsdogs";

        word = word.replaceFirst("love","");
        word = word.replaceFirst("dogsdogs", "");

        System.out.println(word);

    }
}
