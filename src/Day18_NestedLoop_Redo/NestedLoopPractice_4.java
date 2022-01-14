package Day18_NestedLoop_Redo;

import java.util.Scanner;

public class NestedLoopPractice_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        while(true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is a odd number");
            }

            System.out.println("Would you like to enter another number");
            String ans = scan.next();

            while(!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                System.err.println("Invalid answer. PLease re-enter: ");
                ans = scan.next();
            }
            if(ans.equalsIgnoreCase("no")) {
                System.out.println("Goodnight!");
                break;
            }
        }

        scan.close();
/*
Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */
        System.out.println("-----------------------------------");
            String star = "* ";
        for (int i = 0 ; i < 10; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(star.repeat(i));
            }
        }
        /*
        Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */
    }
}
