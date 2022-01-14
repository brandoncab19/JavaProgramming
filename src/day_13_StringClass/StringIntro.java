package day_13_StringClass;

public class StringIntro {
    public static void main(String[] args) {

        String str = new String("Yo whats up");
        String str2 = new String("yo whats up");

        System.out.println((str == str2));

        System.out.println("----------");

        String text1 = "yo whats up",
                text2 = "yo whats up";

        System.out.println(text1 == text2);


    }
}
