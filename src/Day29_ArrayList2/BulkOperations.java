package Day29_ArrayList2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // addAll(CollectionType): adds collection of values to the arrayList
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        //removeAll(CollectionType): removes all the matching elements from the arraylist
        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        //retainAll(CollectionType): removes all the non-matching elements from the arraylist
        list2.retainAll(Arrays.asList(20,30,40));

        System.out.println(list2);

        System.out.println("----------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET",
                "Scrum Master", "BA", "BA"));

        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println(jobTitles);

        System.out.println("-------------------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        boolean r1 = numbers.contains(9);
        System.out.println(r1);
    //containsAll(CollectionType): checks if all the elements are contained in the arraylist
        boolean r2 = numbers.containsAll(Arrays.asList(2,4,6));
        // checks if all numbers are in the arraylist. if one isn't? it's false
        System.out.println(r2);

        System.out.println("-------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);

        System.out.println("------------------------------------------------------");

        int[] num = {2,4,6,8,10,12,14};

        ArrayList<Integer> numList = new ArrayList<>(convertArrayToArrayList(num));

        System.out.println(numList);
        /* cannot convert a primitive(short, byte, int, long, etc...) through
        the Arraylist set up. have to create a custom method to convert a primitive array
        to an ArrayList
         */

    }
    public static ArrayList<Integer> convertArrayToArrayList(int[] arry){

        ArrayList<Integer> numList = new ArrayList<>();

        for (int each : arry){
            numList.add(each);
        }

        return numList;
    }

}
