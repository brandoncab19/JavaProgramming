package Day36_Inheritance.AnimalTask;

public class Animal_ParentClass { // Parent Class

    public String name, breed, size, color;
    public char gender;

    public void setInfo(String animalName, String animalBreed, String animalSize, String animalColor, char animalGender) {

        name = animalName;
        breed = animalBreed;
        size = animalSize;
        color = animalColor;
        gender = animalGender;



    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void eat(){
        System.out.println(name + " is barking right now!");

    }

    public void drink(){
        System.out.println(name + " is drinking");

    }

    public void move(){
        System.out.println(name + " is on the move");

    }

    public void sleep(){
        System.out.println(name + " is sleeping..shhhh");

    }

}
