package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
*/
        Integer num = 2000;
        //list.remove(200);
        boolean r = list.remove(num);
        // remove(int index): removes the element at the given index
        // remove(Object): removes the given object from arraylist, returns boolean
        System.out.println("-----------------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        //indexOf(Data): returns the first matching element's index number, returns int
        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4
        // lastIndexOf(Data): returns the last matching element's index number, returns int
        System.out.println(a);
        System.out.println(b);

        boolean r1 = characters.contains('A');
        boolean r2 = characters.contains('W');

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("--------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        boolean r4 = list1.equals(list2);
        // equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise returns false

        System.out.println(list1 == list2); // == operator only valid for primitive types
        System.out.println(r4);

        System.out.println("--------------------------------------------");

        System.out.println(list1.isEmpty());

        ArrayList<String> sentence = new ArrayList<>();

        System.out.println(sentence.isEmpty());

        System.out.println("--------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(2,4,6,8,10)); // Bulk Operation

        System.out.println(numbers);

    }
}
