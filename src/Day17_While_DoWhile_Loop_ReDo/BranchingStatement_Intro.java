package Day17_While_DoWhile_Loop_ReDo;

import java.util.Scanner;

public class BranchingStatement_Intro {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            /*
            if(i == 'n'){
                break; // Exits the loop and Switch only!

                /* won't include 'n' because the loop breaks before it will execute it. You
                    need to put the if statement/break after the statement
                 */
            System.out.print(i + " ");

            if(i == 'n') {
                break;
            }
        }

        System.out.println();
        System.out.println("--------------------------");

        // have user enter numbers until they enter a negative number

        Scanner scan = new Scanner(System.in);

        while(true){
            /* can just write "true" in the while loop condition just to get the loop going
            and can break the loop with the "break;" statement
             */
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num < 0){
                break;
            }
        }
        System.out.println("negative number entered");

        System.out.println("-------------------------------");

        for (char i = 'A'; i <= 'N'; i++) {

            if(i == 'E'){
                continue; // aka skip this iteration and continue the loop
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        // grab all odd numbers using the continue; statement

        for (int i = 0; i <= 20; i++) {
            //if(i % 2 != 0){ to grab the even numbers
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
