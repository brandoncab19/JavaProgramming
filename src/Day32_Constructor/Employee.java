package Day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name) {
        this.name = name;
    }

    // Constructor cannot be called by its name. must use ---- this. keyword
    public Employee(String name, char gender){
        this(name);// calling a constructor. different from calling a regular method
        //this.name = name;
        this.gender = gender;

    }

                // Parameters MUST be different. Otherwise, it will show error
    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        // Constructor call MUST be the first step in the new constructor method
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}