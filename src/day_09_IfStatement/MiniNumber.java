package day_09_IfStatement;
/*
1. Create a class called MinNumber, Write a program that can print the
minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */

public class MiniNumber {

    public static void main(String[] args) {
        int n1 = 100,
                n2 = 200;


        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if(n1IsMin){ // If n1 is the minimum number
            System.out.println(n1 + " is the minimum number");
        }

        if (n2IsMin) { // If n2 is the minimum number
            System.out.println(n2 + " is the minimum number");
        }

        if(equal){ // If n1 is equal to n2
            System.out.println("equal");

        }

    }
}