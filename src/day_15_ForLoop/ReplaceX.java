package day_15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        String firstName = "bIGg";
        String lastName = "BOOTY";

        //  firstName =   (""+ firstName.charAt(0) ) .toUpperCase()  + firstName.substring(1).toLowerCase();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);



    }
}

/*
Write a program that asks user to enter a word. and
replace all the x or X with character a

                    Input:
                        xcodeX
                    Output:
                        acodea
 */