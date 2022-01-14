package utilities;

import java.util.Arrays;

public class TestingStation {
    public static void main(String[] args) {

        String[] words = {"boom", "boom", "pap!"};

        words = ArraysUtility.replacElement(words, 2, "Pow!");

        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------");

        int[] numbers = {1,2,3,3,3,4,5,6,7,7,7};

        numbers = ArraysUtility.replaceAllElement(numbers,3,500);

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------");

        String[] names = {"Tony", "Tony", "Tony", "Pajamas", "Pajamas"};

        names = ArraysUtility.removeDuplicates(names);

        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------");

        int n1 = 22;

        int result = MathUtility.square(n1);

        System.out.println(result);

    }
}
