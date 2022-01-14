package day_07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
    int b1 = 100;
        b1 = 250;

    String str = "java";
           str += " programming";

    int b2 = 300;
        b2 += 420;

    double b3 = 25.5;
           b3 *= 2.5;

    int b4 = 500;
    b4 %= 3; // will divide then assign the remainder as the new value

        System.out.println("b1 = " + b1);
        System.out.println("str = " + str);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        // Variables always remember the last assigned value

        System.out.println("---------------------------------");

        double num3 = 100;
        // %=
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("-----------------------------");

        int amount = 127;  // cents
        int quarters = amount / 25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("---------------------------------");

        int x = 300;
        int y = 300;

        y %= 16; // Will divide 300 by 16 and print the remainder of that divided equation
                // remainder will be y = 12
        System.out.println("y = " + y);

        System.out.println("----------------------------------");

        int balance =  3500;

        // insurance fee: $153

        balance %= 153;

        System.out.println("balance = " + balance);




    }
}
