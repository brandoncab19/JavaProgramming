package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4
        numbers.add(60);
        // .add(given element) method adds the data to the last index of the ArrayList
        // .add(given index, given element) method adds the data to the given index of the ArrayList
        numbers.add(2,25);
        numbers.add(5,45);

        System.out.println(numbers);

        System.out.println(numbers.size());
        //size(): returns the total number of elements
        int lastIndex = numbers.size()-1; // similar to .length() - 1 method for String
        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        //get(index): returns the element at the given index
        System.out.println("num = " + num);

        System.out.println("-------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            // to get all the elements in the ArrayList
        }

        System.out.println("-------------------------------");

        ArrayList <String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");
        list.set(3,"C++");
        //set(index,  Data): replaces the element at given index with the new element.
        System.out.println(list);

        System.out.println("-------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("Hulya"); // only will remove the first matching object

        System.out.println(employees);

        boolean objectRemoved = employees.remove("Neira");

        System.out.println(employees);

        System.out.println("objectRemoved = " + objectRemoved);
    }
}
