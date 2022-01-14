package PracticePackage;

import java.util.Scanner;

public class if_else_nested_statement {
    public static void main(String[] args) {
        if(200 >= 69){
            System.out.println("We taking over");
        }

        System.out.println("------------------------------");

        int grade = 94;

        if(grade >= 65){
            System.out.println("congrats! You're a SDET Tester");
        }

        System.out.println("----------------------------------");

        Scanner scan = new Scanner(System.in);


        System.out.println("Yo how old are you?");
        byte age = scan.nextByte();

        if(age >= 21){
            System.out.println("Eligible to drink alcohol. Cheers!");
        }else {
            System.out.println("Better luck somewhere else kid...Too young");
        }


        System.out.println("----------------------------------");


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 == num2 && num3 == num1) {
            System.out.println("All are equal");
        }else if (num1 == num2){
            System.out.println("num1 & num2 are equal");
        }else if (num2 == num3){
            System.out.println("num2 & num3 are equal");
        }else if (num3 == num1){
            System.out.println("num3 & num1 are equal");
        }else {
            System.out.println("None are equal....bi-otch");

        }

        /*
        6. Create a class called EqualNumbers, and write a program that can check
        the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if all are equal ==> print "all equal"
          if only n1 and n2 are equal
        =>print  "n1&n2 are equal"
         if only n2 and n3 are equal
        ==>print "n2&n3 are equal"
              if only n3 and n1 are qual
        ==>print "n3&n1 are equal"
        if none of them are euqal ==> none of
        them are equal
         */
        System.out.println("------------------------------");

        int age2 = scan.nextInt();

        if(age2 >= 13 && age2 < 150) {
            if (age2 < 21) {
                System.out.println("Teen");
            }else if(age2 >= 21 && age2 < 55) {
                System.out.println("Adult");
            }else {
                System.out.println("Senior");
            }
        }else {
            System.out.println("wth kinda age is that?! gtfo!");
        }

        scan.close();



        /*
        Create a class called AgeGroups, write a program that can define the
            age groups of a person
                age groups are:
                            Teenager (< 21)
                             Adult   (>=21 && <55 )
                             Senior  ( >= 55 )
            if age is negative or greater than 150, print invalid
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */




    }
}