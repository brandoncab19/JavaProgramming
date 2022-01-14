package Testings;

public class test1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            break;
        }

        System.out.println("--------------");

        int a = 0;
        while (a <= 6){
            a +=2;
        }
        System.out.println(a);


        System.out.println("--------------");

        int z = 5;

        for (int i = 5; i > 0; i--) {
            z +=i;
        }

        System.out.println(z);
    }
}
