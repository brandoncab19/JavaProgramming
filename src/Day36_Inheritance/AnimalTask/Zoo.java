package Day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Ringo", "Corgi", "small",
                "Brown", 'M');

        dog1.eat();
        dog1.bark();
        dog1.drink();
        dog1.eat();

        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Trixie", "Simease", "small",
                "Grey", 'F');

        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.move();
        cat1.scratch();
        
        System.out.println(cat1);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Doom", "Red", "X-Large",
                "Red Orange", 'M');

        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        tiger1.move();

        tiger1.roar();
        tiger1.hunt();

        System.out.println(tiger1);

    }
}
