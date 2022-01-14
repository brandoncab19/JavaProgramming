package Day21_ForEachLoop_ReDo;

import java.beans.beancontext.BeanContextChild;

public class ForEachLoopPractice_3_UniqueElement {
    public static void main(String[] args) {

        String[] names = {"Brandon", "Silva", "Ruby", "Ruby",
                "Ruby", "Lynda", "Joey", "Joey",};


        for (String each : names) {
            /* each element. will grab 1 element and compare it with the
            elements in the inner loop
             */
            int frequency = 0;
            for (String element : names) {
                // each element here will be compared with one element at a time from the outer loop.
                if(element.equals(each)) {
                    frequency++;
                }
            }
            if(frequency == 1) { // checking all the elements for the unique(only 1) element
                System.out.println(each); // printing the element thats unique
            }

        }

    }
}
