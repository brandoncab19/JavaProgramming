package Day15_ForLoop_ReDo;

public class StringMethods_6_Boolean {
    public static void main(String[] args) {

        String word = "";
        String word2 = " ";

       boolean r1 = word.isEmpty(),
       r2 = word2.isEmpty();

        System.out.println("r1 = " + word.isEmpty());
        System.out.println("r2 = " + word2.isEmpty());

/*
 .isEmpty method is a boolean and looks for Strings that are completely empty. NO spaces or
 any characters to print true with isEmpty
 */
      boolean r3 = word.isBlank(),
       r4 = word2.isBlank();
/*
.isBlank method is a boolean and looks for Strings with no characters(regardless of having spaces or not)
to print true with isBlank
 */

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);


        System.out.println("----------------------------------");

        String str = "YEs, I aM HappY";

        System.out.println(str.equalsIgnoreCase("yes"));
        /* .equalsIgnoreCase is a boolean that will see if each string given is equal regardless if
        the string has uppercase or lower
         */

        boolean check1 = str.contains("HappY");
// .contains is a boolean that will see if the string given is in the original String

        boolean check2 = str.contains("Java");

      //boolean check3 = str.toUpperCase().contains("I AM HAPPY");
        boolean check3 = str.toLowerCase().contains("i am happy");
        // how to use .equalsIgnoreCase with .contains method

        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);

        System.out.println("------------------------------");

        String str1 = "Wooden Spoon";

        Boolean a1 = str1.startsWith("Woo"); // true
     // .startsWith looks to see a given String is in the Start of the assigned String

        System.out.println(a1);

        boolean a2 = str1.endsWith("on"); // true
 //.startsWith looks to see a given String is in the end of the assigned String

        System.out.println(a2);

        boolean a3 = str1.toLowerCase().startsWith("wooden");
        // to ignore case sensitivity

        System.out.println(a3);




    }

}
