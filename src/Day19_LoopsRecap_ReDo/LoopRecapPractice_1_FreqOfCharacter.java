package Day19_LoopsRecap_ReDo;

public class LoopRecapPractice_1_FreqOfCharacter {
    public static void main(String[] args) {
        /* Find frequency of the first character.
        Next find how many times it occurs in the string
         */
        String str = "aaabaacccd";

        char ch = str.charAt(0); // getting the first character of the string. 'a'
        int count = 0; // to count how many characters are in the string

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // representing each character of the String(str)

            if(ch == each){
                // will check how many times the selected character in char is in the string(str)
                count++;
            }
        }

        System.out.println(count);

        System.out.println("------------------------------");

        String sentence = "BiingBoonngg";

        String result = "";

        for (int j = 0; j < sentence.length(); j++) {
            char ch2 = sentence.charAt(j); // loop and gets all the characters of the string
            int count2 = 0; // variable for storing the frequency of the char variable

            for (int k = 0; k < sentence.length(); k++) { // inner loops finds the frequency of each character of the string
                char eachChar = sentence.charAt(k); // will compare every single character of that String

                if(ch2==eachChar){
                    count2++;
                }
            }

            if(result.contains("" + ch2)){ // to keep the frequency, but skip the duplicate characters
                /* Remember, .contains() method ONLY accepts a String. so to use the char variable, just turn it to
                a String using " " +
                 */
                continue;
            }

            result += ch2; // adding the characters back to a variable
            result += count2; // adding the frequency of each character to a variable
        }

        System.out.println(result);

    }
}
