package Day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;

    }

    static {
        schoolName = "Cydeo school";
    }

    public String toString() {
        return "CydeoStudent{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}


class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");
        CydeoStudent student3 = new CydeoStudent("Joey");
        CydeoStudent student4 = new CydeoStudent("Kimberly");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(student3.studentName + " : " + student3.schoolName);
        System.out.println(student4.schoolName);
    }
}
