package Day17_While_DoWhile_Loop_ReDo;

public class BranchingStatementPractice_1 {
    public static void main(String[] args) {

        String str = "AABBCCD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if(result.contains(ch)){ // if the result already contains the character
                continue; // skips the duplicate
            }
            result += ch;
        }

        System.out.println(result);

    }
}
