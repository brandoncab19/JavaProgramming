package Day17_While_DoWhile_Loop_ReDo;

public class DoWhileLoopPractice_1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("--------------------------");

        int j = 0;

        while(j <= 10){
            j++;
            System.out.print(j);
        }
        System.out.println();
        System.out.println("---------------------------");

        int k = 0;

        do{
            System.out.print(k++);
        }while(k <= 10);
    }
}
