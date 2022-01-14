package Day35_Encapsulatiion;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Brandon", 29,'M',
                "English/Spanish");


        System.out.println(person1);

        person1.eat("burgers");
        person1.drink("Water, cuz I'm broke");


    }
}
