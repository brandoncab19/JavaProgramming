package Day34_GarbageCollection_AccessModifiers;

public class AccessModifiers { // public class --- name MUST match with file name

    public static int  publicData = 200; // visible everywhere
    static int defaultData = 300; // default modifier not visible outside the package
    private static int privateData = 600; // private modifier not visible outside the class


    private static String split =
            "------------------------------------------";


    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }


}
