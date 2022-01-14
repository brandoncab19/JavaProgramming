package day_11_SwitchAndScanner;

public class DaysInWeekSwitch {
    public static void main(String[] args) {
        int number = 5; // int, byte, String, short : Are accepted datatypes accepted

        /*
        int dayOfWeek = 5;

        if(dayOfWeek >= 1 && dayOfWeek <= 7){ // If the number is valid. (1-7) This is Pre condition
            if(dayOfWeek == 1){
                System.out.println("Mon");
            }else if(dayOfWeek == 2){

         */
        /*

        Data types that CANNONT be used in switch statement:
        long
        float
        double
        boolean

         */


        switch (number){ // 1,2,3,4,5,6,7
            case 1:
                System.out.println("Mon");
                break; // Exits the switch after writing the case block

            case 2:
                System.out.println("Tues");
                break; // must include break statement in each case block to execute the correct case block ONLY.

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thur");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default: // similar the final else statement. Only executed if none of the other cases match
                System.out.println("invalid day selected");

        }


    }
}
