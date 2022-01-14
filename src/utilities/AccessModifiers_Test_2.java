package utilities;

import Day34_GarbageCollection_AccessModifiers.AccessModifiers;
import static Day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public class AccessModifiers_Test_2 {
    // public class --- name MUST match with file name
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);    // visible everywhere
        //System.out.println(AccessModifiers.defaultData); // default modifier not visible outside the package
        //System.out.println(AccessModifiers.privateData); // private modifier not visible outside the class

        System.out.println("---------------------------------");

        AccessModifiers.method1();   // public method visible everywhere
        //AccessModifiers.method2();   // default method not visible outside the package
        //AccessModifiers.method3(); // private method is not visible outside the class

    }
}
