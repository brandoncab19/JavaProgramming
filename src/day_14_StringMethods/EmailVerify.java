package day_14_StringMethods;

public class EmailVerify {
    public static void main(String[] args) {

        String email = "brandonFCab@gamil.com";

        boolean result = email.contains("@gmail.com");

        System.out.println(result);



    }
}

/*
write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
 */