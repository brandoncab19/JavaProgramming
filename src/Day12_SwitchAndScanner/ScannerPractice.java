package Day12_SwitchAndScanner;

import java.util.Scanner;
// import java.util.*;    - * -  Wild Import: Imports everything from package, but takes much more memory

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number btwn 1 and 10");
        int num = scan.nextInt();

        String result = "";

        if(num >= 1 && num <= 7){
            result = (num == 1)? "mon" :(num==2)? "tues" :(num == 3)? "wed" :(num==4)? "thur" :
                    (num == 5)? "fri" :(num==6)? "sat" : "sun";

        }else {
            result = "invalid number";
        }


    }
}
