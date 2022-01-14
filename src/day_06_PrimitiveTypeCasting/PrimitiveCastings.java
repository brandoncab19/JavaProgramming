package day_06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {
        // Implicit Casting

        byte a = 100;
        short b = a;
        // Implicit casting: assigning a smaller primitive to a larger primitive

        int c = b;
        // int c = (int)b; Going from a larger primitive to a smaller

        long d = c;

        float e = d;

        System.out.println("----------------");
        /*
        Explicit Casting
            You have to use Casting Operater "()"
         */

        int x = 55;
        short y = (short)x;
        /* Explicit casting: Larger primitive to smaller primitive(Manually)
        can only be done manually!
         */

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;
        /* When casting from double to int, the value will
        remain the same without the decimal.
        10.8 to 10
         */

        double d1 = 20.5;
        short s1 = (short)d1;

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long m2 = (long) f1;
        /*
        Explicit casting operater keys: OPT + ENTER > Cast
         */

    }
}
