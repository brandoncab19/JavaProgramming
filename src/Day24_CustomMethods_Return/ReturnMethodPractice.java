package Day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int max = maxNumber(23,64);
        System.out.println(max);

        int multiply = max * 3;
        System.out.println(multiply);

    }

    public static int maxNumber(int num1, int num2){
 /*  create an empty variable(result) when making the function to have a variable the
 return method can hold onto/use outside the method
  */
        int result = 0;

        if(num1 > num2){
            result = num1;
        }else {
            result = num2;
        }

        return result; // pretend this is your temporary print statement
        // used for exiting the method
        // must create a value if you want to reuse the method
        // we can use it for returning a value from return methods
    }
}
