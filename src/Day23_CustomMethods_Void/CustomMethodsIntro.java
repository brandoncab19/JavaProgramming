package Day23_CustomMethods_Void;

public class CustomMethodsIntro {
        //  use "void" when you don't need any datatype to be returned.just perform the task
    public static void main(String[] args) {
        System.out.println("Test started!");
        greeting();
        System.out.println("Test done");
    }
    // Always use the main method to print the methods you want to call

//    must use a Parameter --> () when any information is needed to complete the task
    public static void greeting(){
        System.out.println("Hello Cydeo ");
        System.out.println("How are you today?");
    }
//                    DatatypeName

    // public: the method is public and always accessible
    //        static: method can be called through it's class name
    //               void: this return type does not return any data outside the method. Just performs the task given in the function method
    //                        parameter(): Only needed when it helps to complete the function
       public static void dataName (){}
    //                    dataName: A unique name that'll help you find and re-use the method
}
