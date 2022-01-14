package day_10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 11;
        String month = ""; // temporary

        if(number >= 1 && number <= 12){ // if the number is valid(Pre Condition)
            if(number == 1){
                month = "Jan";
            }else if(number == 2){
                month = "Feb";
            }else if(number == 3){
                month = "March";
            }else if(number == 4){
                month = "April";
            }else if(number == 5){
                month = "May";
            }else if(number == 6){
                month = "June";
            }else if(number == 7){
                month = "July";
            }else if(number == 8){
                month = "Aug";
            }else if(number == 9){
                month = "Sept";
            }else if(number == 10){
                month = "Oct";
            }else if(number == 11){
                month = "Nov";
            }else {
                month = "Dec";
            }


        }else{ // If the number is not valid
            month = "Invalid number";
        }

        System.out.println(month);

        /*
        MUST add final print statement in the end to
        print everything other wise nothing will show when running
         */




    }
}
