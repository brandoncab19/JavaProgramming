package Day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int gradeScore = 74;
        String result = "";

        if(gradeScore >= 0 && gradeScore <= 100){ // If score is valid or not. This is a pre condition.
            if(gradeScore >= 90){
                result = "Excellent";   // This is another option when writing out the string.
            }else if(gradeScore >= 80){
                result ="Great";     // Another option. Easier/more organized.
            }else if(gradeScore >= 70){
                System.out.println("Good");
            }else if(gradeScore >= 60){
                System.out.println("passed");
            }else if(gradeScore >= 0){
                System.out.println("failed");
            }

        }else{ // if the score is NOT valid
            result = "Invalid Score";
        }

        System.out.println("-----------------");




    }
}
