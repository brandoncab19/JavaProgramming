package PracticePackage;
/*
Practice Tasks:
	1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */
public class PracticeSession2 {

    public static void main(String[] args){
        int a = 19;
        int b = 30;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("--------------------");

        /*
        2. create a class named LeapYear, and write a program that can
        identify if the given year is leap Year, print true if it's a
        leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly
        divisible by 4 (with remainder of zero), it's leap year

         */

        int year = 2021;

        System.out.println("year = " + year);

        year %= 4;

        boolean isAleapyear = year % 4 == 0;

        System.out.println(year + " is a leap year: " + isAleapyear);

        System.out.println("-----------------");

        /*
3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
         */

        int hourlyRate = 22;
        int weeklyHours = 33;
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = 0.04 * salaryBeforeTax;
        double federalTax = 0.12 * salaryBeforeTax;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);









    }
}
