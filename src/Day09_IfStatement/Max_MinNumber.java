package Day09_IfStatement;
/*
       1. Maximum number between two different numbers
        2. Minimum number between two different numbers
 */
public class Max_MinNumber {
    public static void main(String[] args) {

        int num1 = 79,
                num2 = 34;

        boolean num1IsMax = num1 > num2 && num2 < num1;
        boolean num2IsMax = num2 > num1 && num1 <num2;

        if(num1IsMax) {
            System.out.println(num1 + " Is the maxium number");

        }else {
            System.out.println(num2 + " is the maxium number");
        }


    }
}
