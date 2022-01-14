package Day30_CustomClass;

public class Employee {

    String name;
    String jobTitle;
    String idNumber;
    char gender;
    double salary;
    boolean isFullTime;

    public void employeeInfo (String name, String jobTitle, String idNumber,
                              char gender, double salary, boolean isFullTime) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.idNumber = idNumber;
        this.gender = gender;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(name + " in " + jobTitle +
                " is coding, working hard");
    }


}
/*
Employee Class:

		Attributes:

			name, id, gender, jobTitle, salary, isFullTime(boolean)

		Actions:

			toString(): to be bale to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */