package day_21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100,300,70,400,350};
        int min = numbers[0];
/*

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){ // if there is an element in the array that's smaller
                min = numbers[i]; // smaller number will be assigned to the variable min
            }
        }
*/
        for (int number : numbers) {
            if(number < min){
                min = number;
                System.out.println(min);
            }
        }

    }
}
