package Day13_StringMethod_ReDo;

// import java.lang.String; <-- Any class in this package can be imported implicitly

import javax.sound.midi.Soundbank;

public class StringIntro {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
 // This is a String literal. Which'll be stored in a String Pool. Which is in the Java Heap(memory location)

        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";
// All 4 "Wooden Spoon" objects are identical and are actually all one object in the String Pool

        System.out.println(name == name2); // true
        /*
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true
         */

        System.out.println("--------------------------------");

        String str = new String("Java");
        String str1 = new String("java");
// These are 2 different objects. When using the "new" keyword, it's a separate(new) object.NOT THE SAME
//          These objects are being stored in the Java Heap(ONLY). Not the String Pool

        System.out.println(str == str1);// false

        System.out.println("--------------------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2)); // true ---> because the sequence of characters are the same
        // Use the ".equals()" instead of == , to compare the sequence of characters(the value) in the object
        //


    }
}