package Day18_NestedLoop_Redo;

import java.util.Scanner;

public class NestedLoopPractice_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Addition = " + (num1 + num2));

            System.out.println("would you like to add another number?: ");
            String a = scan.next();

            while(!(a.equals("yes") || a.equals("no"))) {
                System.err.println("invalid entry, try again");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")) {
                break;
            }
        }
        scan.close();
    }
}
