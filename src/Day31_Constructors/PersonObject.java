package Day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

                        // Person()  -- this is the Constructor method
        Person person1 = new Person("Danny", 'M',36);
                        // The constructor method replaces the "setInfo" method

        System.out.println(person1);

        Person person2 = new Person("Kseniia", 'F', 28);

        System.out.println(person2);
    }
}
