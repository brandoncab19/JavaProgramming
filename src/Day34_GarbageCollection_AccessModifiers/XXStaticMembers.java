package Day34_GarbageCollection_AccessModifiers;

public class XXStaticMembers { // outer class CANNOT be a static class

    static class class1 {
// static classes can only be created within a class(an outer class) a nested class

    }

    public static int num1 = 23;


    public static void method() {

    }

    static {


    }

}
            // Nested class
class ClassA {            // outer class

    static class ClassB{ // inner class.
                        // static classes can only exist within a class
        public static void method(){}

    }

}

class ClassC {
    public static void main(String[] args) {
        ClassA.ClassB.method();
    /* the method is in class B(static class) and the method FIRST, MUST be
    called through its outer class(Class A), then the inner class(Class B)(static class)
    */

    }
}

