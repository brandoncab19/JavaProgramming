package Day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void oddOrEven(int number ){

        if(number % 2 == 0){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }

    }

    public static void ageOfPerson(int birthYear){

        int year = 2048;
        System.out.println("Age of person is " + (year - birthYear));
    }

    public static void main(String[] args) {

        oddOrEven(22);
 //the method will demand additional info to complete the task when a parameter is given

        System.out.println("----------------------");

        ageOfPerson(1992);


    }

}
