package Day35_Encapsulatiion.Encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){ // no parameters in the getter
        //getter(method) allows you to call the PRIVATE instance variable
        return name;
    }

    public int getAge(){
        return age; // getter is NOT void and return type MUST match instance variable
    } // getter (ONLY)reads the variable

    public void setName(String name){
        // setter parameter MUST be the same as the instance variable you're setting
        // setter(method) allows you to adjust(modify) the private instance variable
        this.name = name;
    }

    public void setAge(int age){
        if (age <= 0 || age > 150){
            System.err.println("Invalid age" + age);
            System.exit(0);
        }
        this.age = age;
    } // setter writes/adjusts the variable


}
