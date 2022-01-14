package Day30_CustomClass;

public class Student {

    String name;
    char gender;
    int age;
    String studentID;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    public void studentInfo(String name, char gender, int age, String studentID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        /* this.(variableName)
        Keyword used to avoid confusion when creating the parameter that
        may have the same name in the instance variable
        this. keyword when used. compiler knows you're calling the instance variable
     */
    }

    public void wakeUp(){
        System.out.println(name + " is waking up");
    }

    public void eat(){
        System.out.println(name + " is about to eat sumn");
    }

    public void code(){
        System.out.println(name + " is testing code to make that bread");
    }

    public void drink(){
        System.out.println(name + " is pouring a drink");
    }

    public void party(){
        System.out.println(name + " is partying");
    }

    public void sleep(){
        System.out.println(name + " is going to bed. Goodnight");
    }
}
