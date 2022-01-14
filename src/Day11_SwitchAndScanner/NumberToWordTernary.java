package Day11_SwitchAndScanner;
/*
2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */

public class NumberToWordTernary {
    public static void main(String[] args) {
        int num = 73;
        String result = (num >= 0 && num <=9)?
                        // ()? :()? :()? :()? :()? :()? :()? :()? :()? : "InvalidNumber"; <-----Ternary
                       (num ==0)?"zero" :(num ==1)?"one" :(num ==2)?"two" :(num ==3)?"three"
                               :(num ==4)?"four" :(num ==5)?"five" :(num ==6)?"six" :(num ==7)?"seven"
                               :(num ==8)?"eight" : "nine"
                               : "InvalidNumber";
        System.out.println(result);



    }
}
