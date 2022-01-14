package day_12_SwitchAndScanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name:"); // nextLine
        String fullName = input.nextLine();
        System.out.println("enter your building number:"); // nextInt
        int buildnumber = input.nextInt(); // Enter ignored/added to scanner. MUST clear scanner to use nextLine again
        input.nextLine(); // Scanner cleared
        System.out.println("Enter your street name:"); // nextLine
        String streetName = input.nextLine();
        System.out.println("enter your city:"); // nextLine
        String cityName = input.nextLine();
        System.out.println("enter state:"); // next
        String state = input.next();
        System.out.println("enter zipcode:"); // nextInt
        int zip = input.nextInt();

        System.out.println(" full name: " + fullName + "\n bulding number: " + buildnumber + "\n street:" + streetName
         + "\n city: " + cityName + "\n state: " + state + "\n zipcode: " + zip);

        input.close();




    }
}
