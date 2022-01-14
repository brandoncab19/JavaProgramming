package Day18_NestedLoop_Redo;

public class WhileLoopPractice_5 {
    public static void main(String[] args) {
        // divide two (positive) numbers without using operators /, *, %
        int a = 30;
        int b = 7;

        int count = 0;

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a); // a = whatever amount is left after the loop

    }
}
