package Day36_Inheritance.AnimalTask;

public class Cat extends Animal_ParentClass {

 /* child class can take from the parent class, but the
 parent cannot take from the child class
  */

    public void scratch(){
        System.out.println(name + " is scratching the kids again");
    }

}
