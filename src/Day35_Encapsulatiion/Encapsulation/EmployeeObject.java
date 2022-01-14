package Day35_Encapsulatiion.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Silvia", 'M', 26,
                132000);

        emp1.setAge(32);

        System.out.println(emp1);
    }
}
