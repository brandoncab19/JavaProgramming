package Day33_Statics;

public class iPhone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    //instance(without static) -- means it'll have more than one copy and each object is unique
    // static -- means it'll have one copy with the same value for every object
    // static methods does not accept instances

    public static void printiPhoneOS(){
        System.out.println(OS);
    }

}
