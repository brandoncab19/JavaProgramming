package Day24_CustomMethods_Return;

public class ReturnMethodPractice_2_ReturnStatement {
    public static void nameOfDay(int number) {

        if(number < 1 || number >7){
            System.out.println("invalid");
            return; // this will exit the method(nameOfDay) ONLY. not the entire program
        // The only time you can use the "return" statement in a Void(return Type) method
        }

        if(number == 1){
            System.out.println("Mon");
        }else  if(number == 2){
            System.out.println("Tues");
        }else  if(number == 3){
            System.out.println("Wed");
        }else  if(number == 4){
            System.out.println("Thur");
        }else  if(number == 5){
            System.out.println("Fri");
        }else  if(number == 6){
            System.out.println("Sat");
        }else {
            System.out.println("Sun");
        }
    }
}
