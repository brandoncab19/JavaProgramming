package day_10_NestedIf;

public class DaysInWeekTernaries {
    public static void main(String[] args) {
        int dayOfWeek = 5;

        if(dayOfWeek >= 1 && dayOfWeek <= 7){ // If the number is valid. (1-7) This is Pre condition
            if(dayOfWeek == 1){
                System.out.println("Mon");
            }else if(dayOfWeek == 2){
                System.out.println("Tues");
            }else if(dayOfWeek == 3){
                System.out.println("Wed");
            }else if(dayOfWeek == 4){
                System.out.println("Thurs");
            }else if(dayOfWeek == 5){
                System.out.println("Fri");
            }else if(dayOfWeek == 6){
                System.out.println("Sat");
            }else if(dayOfWeek == 7){
                System.out.println("Sun");
            }


        }else{
            System.out.println("Invalid number");
        }
        System.out.println("----------------");

        String result = (dayOfWeek ==1)? "Mon":(dayOfWeek ==2)? "Tues":(dayOfWeek ==3)? "Wed":(dayOfWeek ==4)? "Thurs"
                :(dayOfWeek ==5)? "Fri":(dayOfWeek ==6)? "Sat": "Sun";
        System.out.println(result);
    }

}
