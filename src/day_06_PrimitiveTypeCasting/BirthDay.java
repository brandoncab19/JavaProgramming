package day_06_PrimitiveTypeCasting;
/*
1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     Brandon was born on March/19/1992.
 */

public class BirthDay {

    public static void main(String[] args) {
        String name = "Brandon";
        int birthDay = 19;
        String month = "March";
        int birthYear = 1992;

        // Brandon was born on month/day/year. Add the slash mark
        System.out.println(name + " was born on " + month + "/" + birthDay + "/" + birthYear);
        System.out.println("--------------------");

        // My favorite is "One Fish two Fish"
        String bookName = "One Fish Two Fish";

        System.out.println("My favorite book is " + "\"" + bookName + "\"");
        /*

        \n
        \t
        \"
        \\
        \'

         */


    }

}
