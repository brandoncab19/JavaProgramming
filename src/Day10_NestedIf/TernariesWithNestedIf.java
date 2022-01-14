package Day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 68;
        /*
        if(score >= 0) && (score <= 100){
            if(score >= 60){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }else {
            System.out.println("Invalid Score");
        }
         */

        String finalGrade = (score >= 0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Invalid Score";




    }
}
