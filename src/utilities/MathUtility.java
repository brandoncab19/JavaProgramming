package utilities;

public class MathUtility {

    // adds two numbers
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    // subtracts two numbers
    public static int subtract(int num1, int num2){
        return  num1 - num2;
    }

    public static double subtract(double num1, double num2){
        return  num1 - num2;
    }

    // multiplies two numbers
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    // divides two numbers
    public static int division(int num1, int num2){
        return  num1/ num2;
    }
    
    public static double division(double num1, double num2){
        return  num1/ num2;
    }

    // prints if number is odd
    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }
    // prints if number is even
    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }

    // finds the max of two numbers
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }

    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }

    // gives you the minimum of two numbers
    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }
    
    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }



    public static int square(int num){
        return num * num;
    }
    
    public static double square(double num){
        return num * num;
    }


    public static int cube(int num){
        return num * num * num;
    }
    
    public static double cube(double num){
        return num * num * num;
    }

}
