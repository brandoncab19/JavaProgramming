package day_12_SwitchAndScanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in); //
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //Wooden Spoon - Enter
        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine(); //Java Programming Language - Enter
        System.out.println("Enter your age:");
        int age = input.nextInt(); //25 - Enter(ignored and stored in the scanner)

        input.nextLine(); // capture the Enter key that user pressed for nextInt()
                         // so now Scanner is clear
                        // otherwise, user will be able to enter the input
        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
