package Day17_While_DoWhile_Loop_ReDo;

public class ForLoopPractice_7FreqOfWord_2 {
    public static void main(String[] args) {

        String sentence = "I like dogs and dogs and DOGS way more than cats cats CATS";

        int freqOfWord1 = 0;
        int freqOfword2 = 0;

        for (int i = 0; i <= sentence.length() -3; i++) {
            // minus the amount of the given character. so it doesn't go out of bounds
            String eachWord = sentence.substring(i, i + 3);
            // plus the amount of the given characters.

            if(eachWord.equalsIgnoreCase("dog")){
                freqOfWord1++;
            }else if(eachWord.equalsIgnoreCase("cat")){
                freqOfword2++;
            }
        }

        System.out.println("freqOfWord1 = " + freqOfWord1);
        System.out.println("freqOfword2 = " + freqOfword2);

    }
}