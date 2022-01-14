package Day27_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "1234";

        int num = Integer.parseInt(str);
        // .Parse method converts String to primitive

        System.out.println(num + 1);
        System.out.println(str);

        System.out.println("-------------------------------");

        String str2 = "10.4";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + num);

        System.out.println("-------------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long maxNum = Long.MAX_VALUE;
        long minNum = Long.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-------------------------------");

        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        String s2 = "2468";

        Integer n1 = Integer.valueOf(s2);
        // .valueOf method converts a String into a wrapper class object

        System.out.println(n1);

        int num3 = Integer.parseInt(s2);

        System.out.println(num3);

        System.out.println("-------------------------------");

        String s4 = "20.3";

        Double d2 = Double.valueOf(s4);

        System.out.println(d2);

        System.out.println("-------------------------------");

        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each); // .parseInt needs to convert a String("").
               // used Integer.parseInt because otherwise, it will print the number of the char
            }
        }

        System.out.println("-------------------------");



    }
}
