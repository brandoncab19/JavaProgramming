package day_11_SwitchAndScanner;

/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */

public class NameGradeSwitch {
    public static void main(String[] args) {
        char grade = 'A'; // ==
        String result = ""; // another option before printing

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Pass";
                break;
            default:
                result = "Eh...sa b*tch";

        }

        System.out.println(result);





    }
}
