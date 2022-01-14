package Day27_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num = 200;

        // converting the primitive(int) to an object. It's done implicitly.
        Integer n1 = num; // this conversion is called autoboxing
    // primitives can only be converted to its own object(int to Integer/byte to Byte/ etc....)

        // converting an object to a primitive. Also done implicitly
        int num2 = n1; // this conversion is called unboxing

        System.out.println("-------------------------------");
                        //unboxing
        Byte b1 = 25;
        byte a1 = b1;
        short s1 = b1;
        int i1 = b1;
        // can convert object to any primitive as long as it's in range

        System.out.println("-------------------------------");





    }
}
