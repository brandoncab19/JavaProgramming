package Day35_Encapsulatiion.Encapsulation;

public class Student {


    private String name;
    private int age;
    private char gender, grade;
    private static String schoolName = "Cydeo School";

    public Student(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age < 5 || age > 90) {
            System.out.println("Invalid age of " + age);
            return;
        }

        this.age = age;
    }
    public void setGender(char gender){
        if(!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender of " + gender);
            return;
        }
        this.gender = gender;
    }
    public void setGrade(char grade){
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'
                || grade == 'F')){
            return;
        }

        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is Studying HARD!");
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
