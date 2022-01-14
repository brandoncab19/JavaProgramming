package Day21_ForEachLoop_ReDo;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,23,43,123,5,76,85};
        /*
        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

         */

        for(int each:numbers){
//(new variable where the elements are going : the Array)
            System.out.println(each);
        }
        System.out.println("-----------------------------");
        // find max number using for each loop
        /*
        int[] num = {22,16,33,26,65};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i] < min) {
                min = num[i];
            }
        }

         */

        int[] num = {22,11,23,46,74,34,17,44};
        int max = num[0];

        for (int eachNum : num) {
            //         i : the array
            if(eachNum > max){
                max = eachNum;
            }

        }
        System.out.println("max = " + max);

        System.out.println("-----------------------------");

        // find the min number using for each loop

        int[] moreNumbers = {35,64,86,95,24,54};
        int minimum = moreNumbers[0];

        for (int eachOfNum : moreNumbers) {
        //for(DataType each : Array )
            if(eachOfNum < minimum){
                minimum = eachOfNum;
            }
        }
        System.out.println("minimum = " + minimum);;
    }
}
