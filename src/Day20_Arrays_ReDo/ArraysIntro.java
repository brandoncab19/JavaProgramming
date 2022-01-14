package Day20_Arrays_ReDo;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        /* sized is fixed. Set the size of the elements in the Array FIRST if we don't
        know what the data going into the elements are.
         */

        /* System.out.println(myGroup); // will give hashcode(INCORRECT) --> [Ljava.lang.String;@7d417077
                                        MUST call the .toString method in the Array utility first to
                                        avoid a hashcode in the print.
                                     */
       // System.out.println(Arrays.toString(myGroup));
        // will print "null" if none-primitive Array is empty. Default value

        myGroup[0] = "Joey"; // calling each element when adding data. starting from 0
                            // Remember. index numbers start from 0,1,2,3...
        myGroup[1] = "Chandler";
        myGroup[2] = "Ross";
        myGroup[3] = "Monica";
        myGroup[4] = "Rachel";
        // last element is 5th, but called as 4th coming from the index number

        System.out.println(Arrays.toString(myGroup)); // Prints Array as a String


        System.out.println("---------------------------------");

        String[] daysInAWeek = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        /*Can set the Array as shown above when you know the amount of elements are and
        the data going inside.
         */
        System.out.println(Arrays.toString(daysInAWeek));

        int num = 4; // num

        if(num < 1 || num > 7){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        System.out.println(daysInAWeek[num-1]);
        /* we called the array with the number given. -1 because the
        index number starts from 0. user cant give a number 0 though
         */
    }
}
