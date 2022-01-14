package Day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 69;

        if(score >= 0 && score <=100){ // To see if score is valid. This is Pre conditon.


        if(score >= 60){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


        }else{ // if the score is not valid.
            System.out.println("Score invalid");

        }

        System.out.println("------------------");

        int age = 20;
        boolean hasId = true;

        if(hasId) { // Person has ID. This is the pre-condition

            if (age >= 21) {
                System.out.println("eligible for alcohol");

            } else {
                System.out.println("not eligible for alcohol");
            }


        }else{ // Person does not have ID
            System.out.println("Must have ID");
        }

        System.out.println("-------------------");

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

    }
}
