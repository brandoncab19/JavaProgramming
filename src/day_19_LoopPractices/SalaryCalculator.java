package day_19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("How much you make an hour?");
            int hourlyRate = scan.nextInt();

            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();

            if (weeklyHour <= 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateTax = scan.nextDouble();

            if (stateTax <= 0) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            int grossSalary = hourlyRate *= weeklyHour * 52;
            double federalTax = .26 * grossSalary;
            double stateTaxWithSalary = stateTax * grossSalary;
            double totalTax = federalTax + stateTaxWithSalary;

            System.out.println("1. gross salary: " + grossSalary);
            System.out.println("2. federal tax: " + federalTax);
            System.out.println("3. state tax: " + stateTaxWithSalary);
            System.out.println("4. total tax: " + totalTax);
            System.out.println("5. net income: " + (grossSalary - totalTax));

            scan.nextLine();
            System.out.println("Would you like to continue?");
            String answer = scan.nextLine();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry.Goodbye");
                System.exit(0);

            }
            if( answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }

        }






    }
}

/*
 Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the
					program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the
					program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the
					program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


			Hint: Ones Uzun knows all the formulas you need for this task

 */