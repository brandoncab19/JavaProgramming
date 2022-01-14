package day_08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";


        //Eligible
        if (isEligible) { // true
            System.out.println("eligible");
        }

        if (!isEligible) { // !true - not true - now false with '!'
            System.out.println("not eligible");

        }
    }
}
