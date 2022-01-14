package PracticePackage;

public class ternaries {
    public static void main(String[] args) {
        int number = 237;

       String result = (number % 2 == 0)? number + " is even": number + " is odd";

        System.out.println(result);


        System.out.println("----------------------------------");

        Long salary = 60000L;
        int credit = 543;

        String result2 = (salary >= 60000 && credit >= 650)? "Loan approved": "Loan denied";

        System.out.println(result2);

        
        /*
6. Create a class called Loans, Given two variables salary and credit score, use
those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */


    }
}