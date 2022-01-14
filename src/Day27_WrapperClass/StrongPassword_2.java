package Day27_WrapperClass;

public class StrongPassword_2 {
    public static void main(String[] args) {

        String ps = "cYdeo1990@";

        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;

        /*
        if(ps.length() >= 8 && !ps.contains(" ")){
         */
            for (int i = 0; i < ps.length(); i++) {
                char each = ps.charAt(i); // To obtain/check each character in the String
                if(Character.isUpperCase(each)){
                    upperCase++;
                }else if (Character.isLowerCase(each)){
                    lowerCase++;
                }else if (Character.isDigit(each)){
                    digit++;
                }else { // special char
                    specialChar++;
                }
            }
       /* }else {
            System.err.println("invalid entry");
            System.exit(0);
        }
        */

        boolean hasUpperCase = upperCase > 0;
        boolean hasLowerCase = lowerCase > 0;
        boolean hasDigit = digit > 0;
        boolean hasSpecialChar = specialChar > 0;

        boolean hasStrongPassword = ps.length() >= 8 && !ps.contains(" ") &&
                hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("hasStrongPassword = " + hasStrongPassword);


    }
}
