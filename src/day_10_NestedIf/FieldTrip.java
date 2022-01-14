package day_10_NestedIf;
/*
 Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */

public class FieldTrip {
    public static void main(String[] args){
        int grade = 2;
        String location = "";
        String nameOfTeacher = "";
        int numOfGroups = 0;


        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orchard";
                nameOfTeacher = "Ms. Smtih";
                numOfGroups = 3;
            } else if (grade == 2) {
                location = "Zoo";
                nameOfTeacher = "Mr Lee";
                numOfGroups = 7;
            } else if (grade == 3) {
                location = "Aquarium";
                nameOfTeacher = "Ms Wilson";
                numOfGroups = 5;
            }

        }else{
            System.out.println("Invalid grade");
        }
        System.out.println("location -  "+location+"\nnumber of groups - "
                +numOfGroups+"\nteacher in charge - "+nameOfTeacher);

    }

}
