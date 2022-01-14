package Day10_NestedIf;
/*
4. Create a class called Character Identity, and write a program that can identify if
the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = '@';

        if(ch >= '0' && ch <= '9'){
            System.out.println("digit");
        }else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("Alphabet");
        }else {
            System.out.println("Special Character");
        }





    }
}
