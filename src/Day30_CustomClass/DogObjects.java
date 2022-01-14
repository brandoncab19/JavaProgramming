package Day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Emma";
        dog1.breed = "Shitzu";
        dog1.age = 16;
        dog1.gender = 'F';
        dog1.color = "beige/white";
        dog1.size = "small";

        System.out.println(dog1);

        System.out.println("----------------------------------");

        Dog dog2 = new Dog(); // Objects don't share the same copy of the variables.
        dog2.name = "Max";
        dog2.breed = "Husky";
        dog2.age = 4;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White/Black";

        System.out.println(dog2);

        System.out.println("----------------------------------");

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "French Bulldog", 2,
                "Small", 'F', "Gray");

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.bark();

        System.out.println("----------------------------------");

        Dog dog4 = new Dog();
        dog3.setInfo("Rocko", "Corgi", 3,
                "Small", 'F', "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6,
                "Large", 'F', "Black");

        System.out.println("--------------------------------------------");

        Dog[] myDogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog eachDog : myDogs){
            if(eachDog.gender == 'F'){
                femaleDogs.add(eachDog);
            }else{
                maleDogs.add(eachDog);
            }

        }

        System.out.println(femaleDogs);
        System.out.println(maleDogs);

    }
}
