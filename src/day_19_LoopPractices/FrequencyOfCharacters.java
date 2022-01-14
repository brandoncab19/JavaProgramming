package day_19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabccd";

        char ch = str.charAt(0); // 'a'
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // each character of str
            if(ch == each){
                count++;

            }
        }

        System.out.println("------------------------------");

        String str2 = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str2.length(); j++) {

            char ch2 = str2.charAt(j); // each character from string
            int count2 = 0;

            for (int i = 0; i < str2.length(); i++) { //to find the frequency of each character

                char each2 = str2.charAt(i); // each character of str
                if(ch2 == each2){
                    count2++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);









    }
}
