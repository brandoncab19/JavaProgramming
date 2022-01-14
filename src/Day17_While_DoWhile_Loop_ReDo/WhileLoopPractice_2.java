package Day17_While_DoWhile_Loop_ReDo;

import java.util.Locale;

public class WhileLoopPractice_2 {
    public static void main(String[] args) {
        String str = "Java java JAVA and Python";
        str = str.toLowerCase();
        // to avoid/ignore case sensitivity. now you can type in lower and it'll still find it

        int freqOfWord = 0;

        while(str.contains("java")){
            str = str.replaceFirst("java","");
            freqOfWord++;
        }
        System.out.println(freqOfWord);

        System.out.println("---------------------------------");

        String s = "java java java python python python";

        int countJava =0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
