package day_06_PrimitiveTypeCasting;

public class ArithmetricOperator {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121 Concatencation

        System.out.println(10 + 20); // 30
        System.out.println(10 * 6); // 60
        System.out.println( 100 / 3 );//33
        System.out.println(  10.0/4 ); //2.5
        System.out.println( 10/4.0); //2.5
        System.out.println( 10d/4 ); //2.5

        /*
         + : Addition
         - : Subtraction
         * : Multiplication
         / : Division
         % : Remainder = numerator -(denomenator * result) =
             10/3 = 1       10     - (3 * 3) = 1

          integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33


         */

        int a = 100;
        double b = a/6 ; // 16.0

        double c = (double)a/6; // 16.66666


        System.out.println(b);
        System.out.println(c);
        System.out.println(b + c);
        System.out.println(100d); // adding "d" at the end of the number will print it as a decimal





    }

}
