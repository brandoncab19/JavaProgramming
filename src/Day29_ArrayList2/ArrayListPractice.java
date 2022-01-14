package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        // converting array to arraylist:
        ArrayList<String> list = new ArrayList<>( Arrays.asList(countries) );

        list.removeIf(p -> p.length() > 10);
        // Arraylist to Array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

        System.out.println("----------------------------------------");

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );

        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList(names) );

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
}
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */