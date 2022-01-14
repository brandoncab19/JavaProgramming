package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class XX_ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reverse = new int[array.length];

        int j = 0; // j is the index number of the result variable
        for (int i = array.length - 1; i >= 0; j++, i--) {
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("-----------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i); // grabbing each pulled element from the loop
            reversedList.add(each);

        }
        System.out.println(reversedList);

    }
}
