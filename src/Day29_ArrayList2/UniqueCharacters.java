package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");
                    // Turning a String into a String Array
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        String unique = "";
        for (String each : list) {
            int freq = Collections.frequency(list,each);

            if(freq == 1){
                unique += each;
            }
        }

        System.out.println(unique);

    }
}
