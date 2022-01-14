package Day35_Encapsulatiion;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", is human='" + isHuman + '\'' +
                ", has a Nose='" + hasNose +
                '}';
    }

    public static void printPlanet(){
        System.out.println(planet);
    }
    // if no instances are needed, make the method static
    // instance methods MUST have an object...Consumes more memory

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);

    }
    // if no statics are needed in the method, MUST make the method instance
}
