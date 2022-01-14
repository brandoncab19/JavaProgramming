package day_04_Variables;

public class SaleryCalculator {

    public static void main(String[] args) {
        // hourly rate , weekly rate
        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        // System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

        // "soutv" System.out.println("salary = " + VariableName );

    }
}
