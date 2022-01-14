package Day24_CustomMethods_Return;

public class WarmUpTasks {
    public static void main(String[] args) {

        initials("Brandon", "Cabrera");

        System.out.println("----------------");

        emailDomain("BrandonFCab@gmail.com");

        System.out.println("----------------");

        String[] emails = {"Brandonfcab@gmail.com", "try2see92@aol.com",
                "CustomerSupport@cydeoschool.com"};

        for (String email : emails) {
            emailDomain(email);
        }

        System.out.println("----------------");

        monthOfTheYear(14);

        System.out.println("----------------");

        nameOfDay(4);


    }

    public static void initials(String firstName, String secondName) {

        String initial = firstName.charAt(0) + "." + secondName.charAt(0) + ".";
        System.out.println("initial = " + initial);

    }


    public static void emailDomain(String email) {


        System.out.println("domain = " + email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')));

    }


    public static void monthOfTheYear(int number) {

        if(number > 0 && number <= 12) {
            switch (number) {
                case 1:
                    System.out.println("month is: " + "Jan");
                    break;
                case 2:
                    System.out.println("month is: " + "Feb");
                    break;
                case 3:
                    System.out.println("month is: " + "Mar");
                    break;
                case 4:
                    System.out.println("month is: " + "Apr");
                    break;
                case 5:
                    System.out.println("month is: " + "May");
                    break;
                case 6:
                    System.out.println("month is: " + "June");
                    break;
                case 7:
                    System.out.println("month is: " + "July");
                    break;
                case 8:
                    System.out.println("month is: " + "Aug");
                    break;
                case 9:
                    System.out.println("month is: " + "Sep");
                    break;
                case 10:
                    System.out.println("month is: " + "Oct");
                    break;
                case 11:
                    System.out.println("month is: " + "Nov");
                    break;
                default:
                    System.out.println("month is: " + "Dec");

            }
        }else{
            System.out.println("Invalid entry");
            return;
        }



    }


    public static void nameOfDay(int day){

        String givenDay = (day == 1)? "Sun":(day == 2)? "Mon":(day == 3)? "Tues":(day == 4)? "Wed":(day == 5)? "Thurs":
                (day == 6)? "Fri": "Sat";

        System.out.println("given day is " + givenDay);

    }

    public static void daysInMonth(){}


}

/*
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */