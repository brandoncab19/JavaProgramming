package day_08_IfStatement;
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */

public class GradeReport {
    public static void main(String[] args) {

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100,
                b = score >= 80 && score <= 89;
        //b = score >= 80 && !a; //  if score is a, but score is greater than 80.

        // boolean c = !a && !b && score >= 70;
        boolean c = score >= 70 && score <= 79;

        boolean d = score >= 60 && score <= 69;
        // boolean f = !a && !b && !c && !d;
        boolean f = score >= 0 && score <= 59;

        if (a) {
            System.out.println("Excellent");
        }

        if(b) {
            System.out.println("Great");
        }

        if(c) {
            System.out.println("Good");
        }

        if(d) {
            System.out.println("passed");
        }

        if(f){
            System.out.println("failed");
        }





    }
}