package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
        }

        System.out.println(list);

        System.out.println("---------------------------------------");
                    // find the unique elements

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Java"); //0
        str2.add("Java"); //1
        str2.add("Java"); //2
        str2.add("Python"); //3
        str2.add("C#"); //4
        str2.add("C#"); //5
        str2.add("C#"); //6
        str2.add("Ruby"); //7
        str2.add("C++"); //8
        str2.add("C++"); //9

        ArrayList <String> unique = new ArrayList<>();

        for (String each: str2){
            if(str2.indexOf(each) == str2.lastIndexOf(each)){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("---------------------------------");
            // remove duplicates

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(10);
        listOfNumbers.add(10);
        listOfNumbers.add(20);
        listOfNumbers.add(20);
        listOfNumbers.add(30);
        listOfNumbers.add(30);
        listOfNumbers.add(30);

        ArrayList<Integer> result = new ArrayList<>();


        for (int each : listOfNumbers){
            if(!(result.contains(each))){
                result.add(each);
            }
        }

        System.out.println(result);

    }
}
