package Day18_NestedLoop_Redo;

import java.util.Scanner;

public class NestedLoopPractice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See if user is old enough to drink

        while(true) {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            System.out.println();

            while(!(age > 1 && age < 120)) {
                System.out.println("invalid entry, try again. Enter your age: ");
                age = scan.nextInt();
            }
            if(age >= 21) {
                System.out.println("Congrats! drink up! Cheers!");
            }else {
                System.err.println("Sorry, no drinks for you");
                break;
            }
            System.out.println("would you like to enter an age again?: ");
            String answer = scan.next().toLowerCase();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("huh?...no. Would you like to enter an age agagin?: ");
                answer = scan.next().toLowerCase();

                if(answer.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye!");
                    break;
                }
            }

        }
        scan.close();
    }
}
