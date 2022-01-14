package Testings;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        String name1 = "Max Payne";
        String name2 = "Alan Wake";

        System.out.println("Enter full name:");
        String fullName =  scan.nextLine();

        if(fullName.equals(name1) || fullName.equals(name2)){
            System.out.println("User found!");
        }
    }
}
