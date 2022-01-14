package Day19_LoopsRecap_ReDo;

public class LoopRecapPractice_2_UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabddeefcgg";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if(ch==each){
                    count++;
                }
            }
            /* if(count != 1) - Another option. same result
                    continue;
             */
            if(count == 1){
                // grabbing the characters that only appear once.(unique Character)
                result += ch; // assigning it to a variable

            }

        }

        System.out.println(result);
    }
}
