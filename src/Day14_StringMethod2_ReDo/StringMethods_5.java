package Day14_StringMethod2_ReDo;

public class StringMethods_5 {
    public static void main(String[] args) {

        String str = "Cydeo";

        str = str.repeat(4); 
// .repeat() Repeats the String the amount of times its given in the method

        System.out.println("str = " + str);

        System.out.println("-------------------------------");


        System.out.println("Don't worry, be happy, ".repeat(6));

        System.out.println("-------------------------------");

        String name = "Lynda";
        System.out.println((name + " ").repeat(8));



    }
}
