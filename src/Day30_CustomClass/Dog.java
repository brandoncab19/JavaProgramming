package Day30_CustomClass;

public class Dog {
    // Main method not needed. We ONLY use custom classes for creating objects NOT running


    // instance Variables
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

// "static" method. one copy created for all objects instead of a copy for each object
//       no "static" because we are creating an instance method.
            // Instance methods
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    /*
    // NEEDED in every custom class
    public String toString(){
        return "name" + name;
    }
     */
    // toString NEEDED in every custom class. To be able to print the objects
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setInfo (String dogName, String dogBreed, int dogAge, String dogSize,
                         char dogGender, String dogColor){

        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;


    }

}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */