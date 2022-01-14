package Day18_NestedLoop_Redo;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("----------------------------");

        for (int j = 0; j < 4; j++) {
            /* With nested loop, there is a loop within the loop. Each time the
            first loop(the outer loop) runs, the second loop(inner loop) will run for the amount of
            times given each time the outer loop runs.

            loop inside another loop (inner & outer loops)
            one iteration of the outer loop, executes all the iteration of the inner loop
             */
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }

    }
}
