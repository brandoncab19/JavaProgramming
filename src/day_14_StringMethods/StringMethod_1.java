package day_14_StringMethods;

public class StringMethod_1 {
    public static void main(String[] args) {

        System.out.println("-------------------------------");

        String s = "Java Nova Cava Wawa orange";
        //             012345

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        // int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W") ;
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
