package Day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String word = "Shotgun";
        String result = reverse(word);

        System.out.println(result);

        if(word.equalsIgnoreCase(result)){
            System.out.println(word + " is a palindrome");
        }else {
            System.out.println(word + " is not a palindrome");
        }

    }
    // use a different return type when it's a specific data and returns you a value
    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
        /* "return" the function so you can reuse the method, not just
        completing the task. MAKE SURE you change the return type so it
        may allow you to do so.
         */
    }



}
