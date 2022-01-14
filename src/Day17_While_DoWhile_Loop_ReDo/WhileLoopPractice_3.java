package Day17_While_DoWhile_Loop_ReDo;

import java.util.Scanner;

public class WhileLoopPractice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // will be decreased after every incorrect attempt

        System.out.println("Username: ");
        String user = scan.next();
        System.out.println("Password: ");
        String ps = scan.next();

        if(user.equals("Cydeo") && ps.equals("Cydeo123")) {
            System.out.println("You are logged in!");
        }else {
            int attempts = 3; // will be decreased after every incorrect attempt
            while(!(user.equals("Cydeo") && ps.equals("Cydeo123")) && attempts > 0) {
                                            // separated the last && operator for the attempts
                if(attempts == 1){
                    System.out.println("Yo! This is your last attempt! GET IT RIGHT!");
                }
                System.out.println("Incorrect username or password. please re-enter");
                System.out.println("Username: ");
                user = scan.next();
                System.out.println("Password: ");
                ps = scan.next();
                attempts--;
            }

            if(user.equals("Cydeo") && ps.equals("Cydeo123")) {
                System.out.println("You are logged in!");
            }else {
                System.err.println("account is locked. Goodbye");
            }

        }
            scan.close();



    }

}

/*
Have user log in. if he/she fails attempt 3 times. they will
be locked out of the account.

    username = "Cydeo"
    ps: "Cydeo123"

 */