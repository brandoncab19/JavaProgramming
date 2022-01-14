package Day15_ForLoop_ReDo;

public class ForLoopPractice_1 {
    public static void main(String[] args) {
        
        // print all even numbers with the loop
        for (int i = 0; i < 55; i+=2) {
            System.out.print(i + " ");
        }
        
        System.out.println();

        System.out.println("-----------------------");
        // Or we can do it like this to get into the rhythm of adding another structure

        for (int i = 0; i <= 55; i++) {

            if(i % 2 == 0)
                System.out.print (i + " ");
        }

        System.out.println();

        System.out.println("-----------------------");

        // loop 'A' to 'Z' and 'z' to 'A'

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        // to change the int and see if it matches with the char iscii table
        }

        System.out.println();

        System.out.println("-----------------------");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("-----------------------");
                // Print a shape using loop
        for (int i = 0; i <= 12; i+= 2) {
            System.out.println("* * * * * * *");
        }

        System.out.println("-----------------------");

        for (int i = 1; i <= 50; i++) {

            if(i % 15 == 0) {
                System.out.print("FINRA ");
            }else if (i % 3 == 0){
                System.out.print("FIN ");
            }else if (i % 5 == 0){
                System.out.print("RA ");
            }else {
                System.out.print(i + " ");
            }

        }



    }
}
