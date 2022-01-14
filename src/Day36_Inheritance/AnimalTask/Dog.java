package Day36_Inheritance.AnimalTask;

    // Child Class
              // extends - Inheriting the parent class
public class Dog extends Animal_ParentClass{ // Dog is an Animal
        /* child        parent

        this child class has the same variables/methods like the parent class

        child class can take from the parent class, but the parent cannot take
        from the child class

        any unique method for the child class can added in the child class
  */

        public void bark(){
            System.out.println(name + " is barking, Loud!");
        }

}
