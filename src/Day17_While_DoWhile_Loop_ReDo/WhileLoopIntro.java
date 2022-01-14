package Day17_While_DoWhile_Loop_ReDo;

import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {
        /*
        if(true){
            System.out.println("Bing Bong"); // gets executed one time
        }
        */
        System.out.println("-------------------------");

        // "While loop" is a repeated if statements. Loops everytime the condition is true
       /* while(true){
            System.out.println("Byron"); // Executed infinite times
        }

        */

        System.out.println("------------------------------");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter another number");
        int num2 = scan.nextInt();

        System.out.println("Enter an operator");
        char ch = scan.next().charAt(0); // must enter valid operators. Use " ! "
        // Remember when you want user to enter a char, add .charAt(0) after calling the scanner

        /* What if the user continues to enter an invalid operator. we will need the code to
        run more than once. We need to change the if Statement to a while loop.
         */
        while(!(ch == '+' || ch == '-')) {
            // When the loop is unknown(In this case for ex). Then while loop is the preferred loop
            System.out.println("Invalid, try again..: ");
            ch = scan.next().charAt(0);
        }


        System.out.println( (ch == '+')? num1+num2: num1 - num2); // ternaries

        System.out.println("--------------------------------");
        // Eligible to vote. only if the user is 18 and over

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        while(!(age >= 1 && age <= 1000)) { // while loop will stop when the condition is false
            System.err.println("invalid entry. PLease enter age: ");
            age = scan.nextInt();
        }

        System.out.println("Are you a U.S. citizen?: ");
        String yesOrNo = scan.next();

        while(!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, yes or no?: ");
            yesOrNo = scan.next();
        }

        System.out.println((age >=18 && yesOrNo.equalsIgnoreCase("yes"))? "Eligible to vote!" : "Sorry, can't vote");

    }
}
