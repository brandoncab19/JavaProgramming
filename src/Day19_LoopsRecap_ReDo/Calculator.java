package Day19_LoopsRecap_ReDo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator: ");
        char operator = scan.next().charAt(0);

        if(!(operator == '+' || operator == '-')) {
            System.err.println("Invalid entry");
            System.exit(0);
            // terminates the remaining program. won't print anything after this line
        }

        System.out.println("Enter a another number: ");
        int num2 = scan.nextInt();

        if(operator == '-'){
            System.out.println(num1 - num2);
        }else {
            System.out.println(num1 + num2);
        }

    }
}
