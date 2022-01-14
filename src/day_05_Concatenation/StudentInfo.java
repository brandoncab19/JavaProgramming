package day_05_Concatenation;
/*
2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name
                2. age
                3. gender
                4. school name
                5. phone number
                6. full time
 */
public class StudentInfo {

    public static void main(String[] args){
        String studentName = "Omar Rashana";
        int age = 24;
        char gender = 'x';
        String schoolName = "NonB University";
        String phoneNumber = "(212) 222 - 1112";
        boolean isFullTime = true;
        double GPA = 3.2;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("GPA = " + GPA);
    }
}
