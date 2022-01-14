package day_11_SwitchAndScanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        double n1 = 6.34; double n2 = 49.32;

        char operator = '+';

        boolean valid = operator == '+' || operator == '*' || operator == '/';

        if(valid){
            switch (operator){
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
            }

        }else{
            System.err.println("invalid operator" + operator);
        }

    }

}
