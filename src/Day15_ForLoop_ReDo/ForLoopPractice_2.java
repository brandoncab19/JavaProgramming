package Day15_ForLoop_ReDo;

import java.util.Scanner;

public class ForLoopPractice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        // pre made int variable to use in the for loop
        for (int i = 1; i < 69; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        System.out.println("--------------------------");

        int totalOfNum = 0; // pre made int variable to use in the for loop

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number: ");
            totalOfNum += scan.nextInt();
        }

        System.out.println("totalOfNum = " + totalOfNum);

        System.out.println("--------------------------");
            // find the max number of what the user enters

        int max = -2147483648; // lowest number possible with Integer
            //     2147483648 <---- Maxium number in Integer
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if(num > max) {
                max = num;
            }
        }

        System.out.println("max = " + max);

        scan.close();

        
    }
}
