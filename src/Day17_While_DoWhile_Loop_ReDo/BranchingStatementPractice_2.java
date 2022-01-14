package Day17_While_DoWhile_Loop_ReDo;

import java.util.Scanner;

public class BranchingStatementPractice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // user log in. 3 attempts. use break;

        System.out.println("enter username: ");
        String u = scan.next(); // Cydeo

        System.out.println("enter password: ");
        String p = scan.next(); // Cydeo1234

        if(u.equals("Cydeo") && p.equals("Cydeo1234")){
            System.out.println("Logged in!");
        } else {
            System.out.println("Incorrect, 3 attempts left!");
            for (int i = 3; i > 0; i--) {

                if(i == 1){
                    System.err.println("LAST ATTEMPT LEFT! GET IT RIGHT!");
                }

                System.out.println("enter username: ");
                u = scan.next(); // Cydeo

                System.out.println("enter password: ");
                p = scan.next(); // Cydeo1234

                if(u.equals("Cydeo") && p.equals("Cydeo1234")){
                    System.out.println("Logged in!");
                    break;
                }

            }
            if(!(u.equals("Cydeo") && p.equals("Cydeo1234"))){
                System.err.println("YOU LOCKED OUT PIMP JUICE!");
            }
        }
        scan.close();

    }
}
