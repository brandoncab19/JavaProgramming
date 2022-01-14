package Day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.employeeInfo("John","Devploper","qwe2467",'M',120000.0,true);
        employee2.employeeInfo("Anna","QA","qwe5674",'F',148786.0,true);
        employee3.employeeInfo("David","Designer","qwe2786",'M',103000.0,false);
        employee4.employeeInfo("Lina","Accounting","qwe7685",'F',83000.0,true);
        employee5.employeeInfo("Kevin","Manager","qwe3921",'M',22000.0, true);


        Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };
        

        int fulltimeEmployees = 0;
        int partTimeEmployees = 0;
        double maxSalary = employee1.salary;
        double minSalary = employee1.salary;

        for (Employee eachEmployee : employees){
            if(eachEmployee.isFullTime == true){
                fulltimeEmployees++;
            }else {
                partTimeEmployees++;
            }
            if(eachEmployee.salary > maxSalary){
                maxSalary = eachEmployee.salary;
            }
            if(eachEmployee.salary < maxSalary){
               minSalary = eachEmployee.salary;
            }

        }

        System.out.println("minSalary = " + minSalary + " aka you broke");
        System.out.println("maxSalary = " + maxSalary + " aka I'm the pope");
        System.out.println("partTimeEmployees = " + partTimeEmployees);
        System.out.println("fulltimeEmployees = " + fulltimeEmployees);

    }
}
/*
CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */
