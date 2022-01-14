package day_21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) { // i = indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("---------------------"); // for each loop (below)
//    (Where the are going : Where the elements are)
        for( int each : numbers){ // each = elements of the array
            System.out.println(each);
        }



    }
}
