package day_13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName = scan.next();

        System.out.println("enter last name");
        String lastName = scan.next();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        String initial = first + "." + last;

        System.out.println(initial);

        scan.close();


    }
}
