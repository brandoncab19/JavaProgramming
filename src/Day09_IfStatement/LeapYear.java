package day_09_IfStatement;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2000;

        boolean leapyear = 2000 % 4 == 0;

        if(leapyear) {
            System.out.println("year: " + year + " is a leapyear");

        }

        if(!leapyear) {
            System.out.println("year: " + year + " is  not a leap year");
        }

        System.out.println("-----------------");

        if(leapyear) {
            System.out.println("year: " + year + " is a leapyear");

        }
        else{
            System.out.println("year: " + year + " is  not a leap year");
        }

    }
}
