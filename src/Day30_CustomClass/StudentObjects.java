package Day30_CustomClass;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentInfo("Brandon Cabrera", 'M', 29,
                "246810BigDaddy");

        Student student2 = new Student();
        student2.name = "Eliza";


        System.out.println(student1);

        student1.wakeUp();
        student1.eat();
        student1.code();
        System.out.println(student2.name + " Said, \"Hola, que tal? Lets go out!\"");
        student1.drink();
        student2.drink();
        student1.party();
        student1.sleep();

    }
}
