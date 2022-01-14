package Day15_ForLoop_ReDo;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
       1st step is as an int until the 3rd step gives the statement. that statement will
       then be repeated through iterator.
         */
        for (int i = 0; i < 8; i++) {
            System.out.println("Medellin");
        }
        /* ForLoop is good when you know the amount loops running, and
        when the loop will end
        */
        System.out.println("---------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 8; i <= 16; i++) {
            System.out.print("Good morning ");
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print("Bing Bong ");
        }



    }
}
