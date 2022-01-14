package Day21_ForEachLoop_ReDo;

public class ForEachLoopPractice_1_AvgNum {
    public static void main(String[] args) {

        int[] numbers = {76,86,56,46,48,32};
        double sum = 0; // variable type is double in case avg is a decimal
    // don't need to call the whole array before calling the element with a double?
        for (int num : numbers) {
            sum += num;
        }

        double avgNumber = sum/numbers.length;

        System.out.println("avgNumber = " + avgNumber);

    }
}
