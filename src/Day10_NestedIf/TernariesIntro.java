package day_10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-----------------");

        String result1 = (n%2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-----------------");

        /*
        int age = 23;

        if(age >= 21){
            System.out.println("Eligible to drink");

        }else{
            System.out.println("Not eligible to drink");
        }
         */

        int age = 23;

        String result2 = (age >= 21)? "eligible" : "not eligible";
        System.out.println(result2);

        System.out.println("-------------");

        /*
        if(b3 >0) {
            System.out.println("positive");
        }else if(b3<100){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
         */
        int b3 = 100;

        String result3 = (b3 > 0)? "positive":(b3 < 0)? "negative" : "zero";
        System.out.println(result3);





    }
}
