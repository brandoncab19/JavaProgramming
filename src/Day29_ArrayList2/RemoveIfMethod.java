package Day29_ArrayList2;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));

       /* for (int i = 0; i < list.size(); i++) {
            if(!(list.get(i) % 2 ==0)){
                list.remove(i);
            }
        }
        */
        /* .removeif method won't work in an if condition becuase the index will change
        as the ArrayList isn't fixed
         */
        System.out.println(list);
                //        -> arrow token for the Lambda expression
        list.removeIf(each -> each % 2 == 0); //Lambda Expression
       //variableName(each) representing the elements
        // variableName is preferred to be 'p' (predicate)
        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList <String> listOfNames = new ArrayList<>();
        listOfNames.addAll(Arrays.asList("Java","Python","JavaScript","C#",
                "C++","Java","Java"));

        listOfNames.removeIf(p -> p.startsWith("J"));

        System.out.println(listOfNames);

        System.out.println("----------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Janila", "Racecar",
                "Lynda", "Silvia", "Otto"));

        names.removeIf(eachName -> StringUtility.isPalindrome(eachName));

        System.out.println(names);

    }
}
