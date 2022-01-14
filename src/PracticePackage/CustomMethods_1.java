package PracticePackage;

public class CustomMethods_1 {
    public static void main(String[] args) {

        int[] nums = {23,43,54,22,75,29};

        int maxNumber = maxArray(nums);

        System.out.println(maxNumber);

    }

    public static int maxArray(int[] numbers){

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }

        }

        return max;
    }

}
