package PracticePackage;
/*
1. Create a class called NumberToWord, and write a java program that
can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */

public class NumberToWord {
    public static void main(String[] args) {
        byte num = 7;
        String result = "";

        if(num >= 0 && num <= 9) {
            if(num == 1){
                result = "one";
            }else if (num ==2){
                result = "two";
            }else if (num ==3){
                result = "three";
            }else if (num ==4){
                result = "four";
            }else if (num ==5){
                result = "five";
            }else if (num ==6){
                result = "six";
            }else if (num ==7){
                result = "seven";
            }else if (num ==8){
                result = "eight";
            }else if (num ==9){
                result = "nine";
            }

        }else {
            System.out.println("Invalid number");
        }
        System.out.println(result);


    }
}
