package Day24_CustomMethods_Return;

public class XXReturnMethodPractice_5_RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aaabbccddeeffgg";

        str = removeDuplicates(str);

        System.out.println(str);



    }
    /*
    1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
     */
    public static String removeDuplicates(String str){
// whatever the returntype(String) is, thats what the result(String) must be!
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
                        // Add "" +  when the condition requires a string
            if(!(result.contains("" + each))){
                result += each;
            }

        }

        return result;

    }
}
