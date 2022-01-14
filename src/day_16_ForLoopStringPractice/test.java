package day_16_ForLoopStringPractice;

public class test {
    public static void main(String[] args) {

        int a = 5;
        byte b = (byte)a;

        System.out.println(b);

        System.out.println("----------------");

        int num = -5;
        System.out.print(num++ + ",");
        System.out.print(num = 0);
        System.out.print("," + --num);
        System.out.println();

        System.out.println("------------------");

        short s = 13 - 9/3 * 10;
        s += -10;
        System.out.println(s);

        System.out.println("------------------");

        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 ==(9-10+1);

        System.out.println(two);

        System.out.println("------------------");

        long l = 100;
        short ss = (short)l;
        System.out.println(ss+10);

        System.out.println("------------------");

        short so = 13 + 3 * (10-6) %2;
        boolean bb = so != 25;

        System.out.println(bb);

        System.out.println("------------------");

        byte big = 104;
        boolean check = big < 100;

        if(check){
            b -= 100;
        }else {
            b = 50;
        }
        System.out.println(b);

        System.out.println("------------------");

        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10; // decimal is less than so whole = 20
        System.out.println(whole);

        System.out.println("------------------");

        String name1 = "Jimmy";
        boolean check1;

        if(name1 == "james"){
            check1 = false;
        }else {
            check1 = true;

        }

        String str1 = check ? "5" : "10";
        //System.out.println(str1 == 10); // Can't compare a string to an int

        System.out.println("------------------");

        int cheeze = 132;
        String boob = "";

        //String boob += cheeze;

    }
}
