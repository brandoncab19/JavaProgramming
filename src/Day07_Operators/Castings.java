package Day07_Operators;
/*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;

                 implicit casting: casting smaller variable types to larger variable types
                 explicit casting: Larger variable type to a smaller variable type
 */
public class Castings {

    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte)averageScore; // This is explicit casting. Larger variable type to a smaller variable type.
                                        // value is now: 20
        short num2 = (short)averageScore; // explicit casting
        int num3 = (int)averageScore; //  explicit casting
        float num4 = averageScore; // no casting
        double num5 = averageScore; // implicit casting
        long num6 = (long)averageScore; // explicit casting

        System.out.println("num1 = " + num1 );
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




    }

}
