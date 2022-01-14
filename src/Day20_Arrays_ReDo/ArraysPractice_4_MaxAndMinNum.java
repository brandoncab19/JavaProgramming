package Day20_Arrays_ReDo;

public class ArraysPractice_4_MaxAndMinNum {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];
        // starting with 0, assuming the first element is the max number

        // variableName.fori -- enter key: shortcut for iterating the array in a loop
        // variableName.forr -- enter key: shortcut for iterating the array in a loop, but in reverse
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                // if there is an element greater than the current max number
                max = numbers[i]; // will replace and assign the greater number back to the max

            }

        }

        System.out.println(max);

        System.out.println("--------------------------------");
        // do the same here, but find the Minimum number

        int[] num = {22,16,33,26,65};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i] < min) {
                min = num[i];
            }
        }

        System.out.println(min);
    }
}
