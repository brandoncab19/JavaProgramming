package day_07_Operators;

public class LogicalOperators {
/*

    && - both must be TRUE. Otherwise it will always result in false
    || - either


 */
    public static void main(String[] args) {
        String name = "Staven";
        int age = 19;
        String citizen = "COL";

        boolean isELigible = age >= 18 && citizen == "USA";
                           // 19 >= 18 && Colombia == "USA; result would be: False
                        //        true  &&   false;  result is: false

        System.out.println(name + " is eligible to vote: " + isELigible);


        System.out.println("--------------------");

            String name2 = "Josh";
            int creditScore = 720;
            int age2 = 22;
            int income = 37_600;

            boolean creditApproval = creditScore >= 680 && age2 >=21 && income >= 50_000;

        System.out.println(name2 + " Eligible for loan: " + creditApproval);

        System.out.println("--------------------");

        //     && - ||
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18  &&  ( 'F' == 'M'  ||   'F' == 'F' )
        //                      true     &&   ( false       ||   true)
        //                      true   &&    true
        //                      true

        System.out.println(name3 + " is able to register: " + isEligible3);

        System.out.println("------------------------");

        String name4 = "James",
            countryOfBirth = "USA";
        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;

        System.out.println(name4 + " is eligible to be a US citizen: " + isEligible4);

        System.out.println("------------------------");

        String name5 = "Braine";
        double gpa = 4.0;
        int familyIncome = 340_000;

        boolean isEligible5 = gpa >= 3.7 || familyIncome <= 86_000;

        System.out.println(name + " is qualified for scholarship: " + isEligible5);

        System.out.println("------------------------");

        //  !

        int score = 85;
        boolean passed = score >= 65;
        boolean failed = !passed;

        System.out.println("passed = " + !passed);
        System.out.println("failed = " + !failed);











    }
}
