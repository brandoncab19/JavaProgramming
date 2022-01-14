package Day17_While_DoWhile_Loop_ReDo;

public class ForLoopPractice_6 {
    public static void main(String[] args) {

        String str = "AAABBBBBCC";
        char ch = 'B';

        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(ch == eachChar){
                frequency ++; // will increase the int variable by 1

            }
        }

        System.out.println(frequency);

        /*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3

 */

        System.out.println("-----------------------------------");


        String  str2 = "JavaJavaJavaJava";


        int frequencyWord = 0;

//      for (int i = 0; i < str2.length()-3; i++)
        for (int i = 0; i <= str2.length()-4; i++) {
            /* -4 so the " i " doesn't go out of bound.
            -4 because it is the length of the given
             */
            String eachSub =    str2.substring(i, i+4 );
            //System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequencyWord++;
            }

        }

        System.out.println(frequencyWord);


        /*
        2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
         */

    }
}