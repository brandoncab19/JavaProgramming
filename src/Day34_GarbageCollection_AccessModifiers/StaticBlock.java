package Day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        // Class isn't run-able without this main method
        // main method only runs in it's class

        System.out.println("Main method");
    }

    static { // runs first before anything, but only runs ONE TIME
        // static block can run outside it's class
        System.out.println("Static Block");

    }
}
