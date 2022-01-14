package PracticePackage;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();

        if (coupons >= 3) {
            int candies = coupons / 10;
            coupons = coupons % 10;
            System.out.println("Number of Candies: " + candies);
            int gumballs = (coupons%10) / 3;
            coupons = coupons % 3;
            System.out.println("Number of Gumballs: " + gumballs);

        } else {
            System.err.println("Not enough coupons");
        }


    }
}

/*
Write a program that displays how many candy bars and
gumballs you can get. You perfer candy bars
 */