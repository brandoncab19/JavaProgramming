package day_15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("------------");

        for(int i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }

    }
}
