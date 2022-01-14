package day_07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        /*

         >  - Greater than
         >= - Greater than OR equal( Or meaning if either or is true, the statement is true
         <  - Less than
         <= - Less than OR equal

         */

        boolean result1 =  200 > 40; // true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150 ; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; //true

        System.out.println("result3 = " + result3);

        boolean result4 =  300 >= 500; // false

        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater,
                                                        // then it's eligible for the loan


        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFailed =  score <= 59; // false
        //                      75 <= 59

        System.out.println("hasFailed = " + hasFailed);


        boolean result7 =  45 <= 60;

        System.out.println("result7 = " + result7);


        System.out.println("------------------------------------------");

        int x = 200;
        int y = 100;

        boolean equal = x == y; // false. not equal

        System.out.println("equal = " + equal);

        boolean example1 = "John cena" == "Eminem"; // False. They are not equal because
                                                    // both string texts are different

        System.out.println("example1 = " + example1);

        boolean example2 = "A " == "a"; // false. not equal
        boolean example3 = "wooden" == "wooden"; // true. Both string texts are exactly equal

        System.out.println("example2 = " + example2);
        System.out.println("example3 = " + example3);

        System.out.println("--------------------------------");






    }
}
