package Day29_ArrayList2;

import java.util.ArrayList;

public class XX_FirstUniqueElements {
    public static void main(String[] args) {
        // finding the unique element without using the .indexOf OR .lastIndexOf

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        for (Integer each : list){

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }
            if(frequency == 1);
            System.out.println(each);
            break; // so it will break the function after finding the first unique element
        }

    }
}
