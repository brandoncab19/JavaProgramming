package Day11_SwitchAndScanner;

public class NumOfDaysInMonth {
    public static void main(String[] args) {
        int number = 9;

        if(number >= 1 && number <= 12){

            switch(number){
                case 2:
                    System.out.println("29 days");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default: // the remaining months
                    System.out.println("31 days");


            }


        }else{
            System.out.println("invalid month number");
        }


        System.out.println("-------------------");

        int year = 2000;
        int num2 = 2;

        String result = "";

        if(num2 >= 1 && num2 <= 12){ // number: 1~12

            switch (num2){
                case 2:
                    result = (year % 4 ==0)? "29 days" : "28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);


    }
}
