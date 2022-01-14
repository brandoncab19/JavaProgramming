package Day17_While_DoWhile_Loop_ReDo;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoopPractice_4_Proposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Baby, will you marry me?");
        String a = scan.next().toLowerCase();
        // to ignore case sensitivity. I can now just use lower case in my condition

        while(!(a.equals("yes") || a.equals("no"))) { // while loop first to show what'll happen if the answer is invalid
            // ! means not equal. or in this case, not valid. Will only be true when the condition is false.
            System.out.println("I'm sorry what? try again");
            a = scan.next().toLowerCase();
        }
        if(a.equals("yes")){
            System.out.println("Congrats! I love you");
        }else {
            System.out.println("Bueno, ciao baby");
        }

        scan.close();
    }
}
