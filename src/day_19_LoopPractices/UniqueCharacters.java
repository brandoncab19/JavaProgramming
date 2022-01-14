package day_19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; // where we store the results... "bdf"

        char ch = 'a';
        int count = 0; //represenst the frequency of the ch

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // each character of str
            if(ch == each){
                count++;
            }
        }

        System.out.println(count);





    }
}
