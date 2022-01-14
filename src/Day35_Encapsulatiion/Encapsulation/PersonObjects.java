package Day35_Encapsulatiion.Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name("Lynda"); // need to apply the setter -- setName
        // p1.age(26);

        p1.setName("Lynda");
        p1.setAge(26);

        // System.out.println(p1.name() + " : " + p1.age()); // need to apply getter -- getName
        System.out.println(p1.getName() + " : " + p1.getAge());

    }
}
