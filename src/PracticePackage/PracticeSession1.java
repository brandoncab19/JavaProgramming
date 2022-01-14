package PracticePackage;

public class PracticeSession1 {
    public static void main(String[] args){
        // CAR PARTS ORDERED
        System.out.println("          ");
        System.out.println("Car parts ordering reciept \n \t 11/07/2021");
        
        String part1 = "4 tires";
        String part2 = "custom muffler";
        String part3 = "Custom stiering wheel";
        String part4 = "3 Nas booster tanks";

        int tires = 300;
        double muffler = 199.25;
        double wheel = 80.75;
        int tanks = 600;
        double total = tires + muffler + wheel + tanks;


        System.out.println("part1 = " + part1);
        System.out.println("part2 = " + part2);
        System.out.println("part3 = " + part3);
        System.out.println("part4 = " + part4);
        System.out.println("total = " + total);

        double paid = 1000.0;

        System.out.println("paid = " + paid);

        total -= paid;
        int remainingtotal = (int)paid;

        System.out.println("remaining total = " + remainingtotal);





    }
}
