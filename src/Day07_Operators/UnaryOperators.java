package Day07_Operators;

public class UnaryOperators {

    public static void main(String[] args){

        int a = 5;

        System.out.println(++a); // pre increment: increases the value by 1 immediately
        System.out.println(--a); // pre decrement: decreases the value by 1 immediately

        System.out.println("--------------------------");

        int b = 100;

        System.out.println(b++); // post increment: increases value by 1 in the NEXT LINE
        System.out.println(b); // 101

        System.out.println("--------------------------");

        int x = 200;

        System.out.println(x--); //post decrement: decreases value by 1 in the NEXT LINE
        System.out.println(x); // 199

        System.out.println("--------------------------");

        int z = 19;

        System.out.println(++z); // z = 20
        System.out.println(z++); // z = 20 until next line
        System.out.println(z); // z = 21





    }

}
