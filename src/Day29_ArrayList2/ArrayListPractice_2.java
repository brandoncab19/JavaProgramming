package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice_2 {
    public static void main(String[] args) {
        // 1. write a program that can swap the first and last elements of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(list, 0, list.size() - 1);

        System.out.println(list);

        System.out.println("------------------------------");
        //2. Write a program that can move all the zeros to the last indexes of ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        System.out.println(numbers);

        int size = numbers.size();

        // numbers.removeAll(Arrays.asList(0)); -- if the elements are known. same result.
        numbers.removeIf(p -> p == 0); // .removeIf if the elements are unknown
        System.out.println(numbers);

        int newSize = numbers.size();

        int totalZeros = size - newSize;
        System.out.println("totalZeros = " + totalZeros);

        for (int i = 0; i < totalZeros; i++) {
            numbers.add(0);
        }

        System.out.println(numbers);

        System.out.println("------------------------------");
    /* 3. Write a program that can extract the special characters, digits and
    letters from a string and stores them into separate ArrayLists of Characters
     */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> allChar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            allChar.add(each);
        }

        System.out.println(allChar);

        ArrayList<Character> letters = new ArrayList<>(allChar);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(allChar);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(allChar);
        specialChar.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);
        /*
        specialChar.removeAll(digits);
        specialChar.removeAll(letters);
         */  // -- another way.same result



    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList


	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:

						list: {1,0,2,0,3,0,4,0}

					output:

						[1, 2, 3, 4, 0, 0, 0, 0]



	3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

				Ex:

					str = "ABCD123$%#@&456EFG!"

				output:

					list1: {1, 2, 3, 4, 5, 6}

					list2: {A, B, C, D, E, F, G}

					list3: {$, %, #, @, &, !}
 */