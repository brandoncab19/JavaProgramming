package day_18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number:");
            int num = scan.nextInt();


            if(num % 2 == 0){
                System.out.println("is an even number");
            }else {
                System.out.println("is an odd number");
            }

            System.out.println("Wanna enter another number or nah?:");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid entry, try again mudda F**ker!");
                answer = scan.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }

        }



    }
}
