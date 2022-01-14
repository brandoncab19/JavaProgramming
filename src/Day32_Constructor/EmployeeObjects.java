package Day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Joey");

        System.out.println(emp1);

        Employee emp2 = new Employee("Brandon", 'M');

        System.out.println(emp2);

        Employee emp3 = new Employee("Lynda", 'F', "QA");

    }
}
