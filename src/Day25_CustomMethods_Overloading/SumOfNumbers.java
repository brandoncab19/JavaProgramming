package Day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(23, 27);
        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(45,20,100);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(20,30,60,75);
        System.out.println("sum3 = " + sum3);

    }

    public static int sumOf2Numbers(int num1, int num2){

        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){

        return num1 + num2 + num3 + num4;
    }
}
