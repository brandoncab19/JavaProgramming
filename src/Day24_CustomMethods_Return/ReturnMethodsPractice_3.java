package Day24_CustomMethods_Return;

public class ReturnMethodsPractice_3 {
    public static void main(String[] args) {

        String str = schoolGrade(82);

        System.out.println(str);

        if(str.equalsIgnoreCase("A")){
            System.out.println("Excellent! Lets Gooo!");
        }else if (str.equalsIgnoreCase("B")){
            System.out.println("Ay, hole on. Great job!");
        }else if (str.equalsIgnoreCase("C")){
            System.out.println("Well done!");
        }else if (str.equalsIgnoreCase("D")){
            System.out.println("iight then. Whats this?");
        }else {
            System.out.println("Whats 9 + 10? 21? You stoopid");
        }

    }

    public static String schoolGrade (int score) {
    //Return type MUST match with the return result. EX: public static String
    //                                          Return result; (result is a String)
        String result = "";

        if (score < 0 || score > 100) {
            result = "invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        return result;
    }


}
