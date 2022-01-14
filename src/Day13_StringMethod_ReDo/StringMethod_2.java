package Day13_StringMethod_ReDo;

public class StringMethod_2 {
    public static void main(String[] args) {

        String str = "Wooden Spoon"; // Remember that String is Immutable
        str = str.toUpperCase();
        /* "WOODEN SPOON". This is a new object and Will NOT print until you assign the
        new object back to the original variable
         */

        System.out.println(str);

        System.out.println("----------------------");

        String ayyYo = "BYYRONN"; // Remember that String is Immutable
       ayyYo = ayyYo.toLowerCase(); // Assign the new object back to the original variable

        System.out.println("Ayo, Whos the President?: " + ayyYo);



    }
}
