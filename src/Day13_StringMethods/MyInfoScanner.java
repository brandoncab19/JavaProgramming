package Day13_StringMethods;

import java.util.Scanner;

public class MyInfoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your info below");
        System.out.println("         ");

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("enter your gender(Non B not allowed): ");
        String sex = scan.next();
        scan.nextLine();

        System.out.println("enter full name: ");
        String fullName = scan.nextLine();

        System.out.println("enter phone number: ");
        long number = scan.nextLong();

        System.out.println("zip code: ");
        int zip = scan.nextInt();
        scan.nextLine();

        System.out.println("school name: ");
        String schoolname = scan.nextLine();

        System.out.println("city: ");
        String city = scan.nextLine();

        System.out.println("state: ");
        String state = scan.nextLine();

        System.out.println("building number: ");
        int buildnumber = scan.nextInt();
        scan.nextLine();

        System.out.println("street name: ");
        String street = scan.nextLine();

        scan.close();

        System.out.println("full name " + fullName);
        System.out.println("age " + age);
        System.out.println("gender " + sex);
        System.out.println("telephone" + number);
        System.out.println("addresss " + "\n \t" + buildnumber + " " + street + "\n \t" + city + ", " + zip);
        System.out.println("school name: " + schoolname);




    }

}


/*
1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY) (Give extra nextLine to clear the Enter keys in the scanner)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name

 */