package Day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void greetingX5() {
        String str = "Hello World\n";
        System.out.println(str.repeat(5));

    }

    public static void cydeoGreetingX5(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }


    public static void evenNumbers1to10() {

        for (int i = 0; i <= 10; i+= 2) {
            int evnNum = i;
            System.out.print(i + " ");
            System.out.println();
        }

    }


    public static void printNumbers (int x, int y) {

        while(x <= y){
            System.out.print((x++) + " ");;
        }

        System.out.println();
    }



    public static void main(String[] args) {
        greetingX5();
        cydeoGreetingX5();

        System.out.println("---------------");

        evenNumbers1to10();

        System.out.println("---------------");

        printNumbers(3,15);

    }

}
