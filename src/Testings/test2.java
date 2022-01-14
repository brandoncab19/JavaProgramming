package Testings;

public class test2 {
    public static void main(String[] args) {

        String str = "sandy";

        System.out.println(str.length()-1);

        System.out.println("------------------------------");

            String word2 = "   Winter is coming   ";
           //  word2 = word2.trim();

        System.out.println(word2.length());

        System.out.println("------------------------------");

        String a = "123";
        String b = 5 + 4 + a; // adds the number first, the concatenation the a variable

        System.out.println(b);

        System.out.println("------------------------------");

        String sa = "Java is fun";
        int cs = sa.charAt(4);

        if(cs == 'a'){
            System.out.println("A");
        }else if(cs == ' '){
            System.out.println("B");
        }else {
            System.out.println("C");
        }

        System.out.println(" " + cs);

        System.out.println("------------------------------");

        String d = "garden";
       d = d.substring(2);

        System.out.println(d);

        System.out.println("------------------------------");

        String f = "The game was tied at 2-2";
        String f2 = f.substring(5);

        System.out.println(f2.indexOf("a"));

        System.out.println("------------------------------");

        int e = 5;
        while(e < 100){ // loop will stop when the condition is false
            e += e; // 80 is still under 100
        }
        System.out.println(e);

        System.out.println("------------------------------");

        int a2 = 0;
        do {
            a2 = a2++ + --a2 - (a2 % 3);
        }while (++a2 < 4);
        System.out.println(a2);

        System.out.println("------------------------------");

        String h3 = "I like to have fun with music";
        System.out.println(!h3.isEmpty());

        System.out.println("------------------------------");




    }
}
