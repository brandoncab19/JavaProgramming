package day_21_ForEachLoop;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        // {50,40,30,20,10};
        int[] reversed = new int[numbers.length];
                        // to make sure the new array can fit the previous array

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(reversed);

        System.out.println("------------------");



    }
}
