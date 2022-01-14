package Day17_While_DoWhile_Loop_ReDo;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean example = false;

        for (int i = 0; example;) {
            System.out.println("wooden spoon -- For loop"); // Will not print
        }

        System.out.println("--------------------------------");

        while(example) {
            System.out.println("wooden spoon -- While loop"); // Will not print
        }

        System.out.println("--------------------------------");

        do{
            System.out.println("wooden spoon -- do while loop"); // will print
        }while(example);
        /* do while loop will print the statement first(regardless if its true or false) then check the condition to
        continue to execute the statement or not
         */
    }
}
