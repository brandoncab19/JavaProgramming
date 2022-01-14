package day_15_ForLoop;

import java.util. Scanner;

public class ForLoopPractices {
    public static void main(String[] args) {

        // (Initialization ; condition ; Interator) <---Mandatory with "for loop"
        //  STEPS: 1       2     4
        for(int i = 15; i <= 45; i++){
            System.out.print(i + " "); // 3
        }

        System.out.println();

        System.out.println("------------");

        for(int i = 100; i >= 50; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------");

        for(int i = 1; i <=55; i++){
            if((i % 2) == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("---------------");

        for(int i = 2; i <= 54; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------------------");

        int sum = 0;
        // +1 +2 +3 .... +100
        for (int i = 1; i < 101 ; i++) { //i: 1,2,3,4,5,6... 100
            sum += i;
        }
        System.out.println(sum); //5050
        System.out.println("---------------------------------------");
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total += scan.nextInt();
        }

        System.out.println("total = " + total);




        scan.close();



    }

}
