package Day16_ForLoop_String_ReDo;

public class ForLoopPractice_5_RemoveDuplicates {
    public static void main(String[] args) {
        // Let's remove the duplicates and return it as a string
        String str = "aabbcddeeffggg";

        String result =""; // end result --> abcdefg

        for (int i = 0; i <= str.length()-1; i++) {
            String ch = "" + str.charAt(i); // i = each character(char) of str
        //      ""  = is added to convert the characters back into a string
            //    so 'a' turns into "a"
             if(!result.contains(ch)) {
                        //.contains() is expecting a string to check. So we converted the char(ch) into a String
                 result += ch; //characters are added back to a variable
             }
        // Unique characters: when the .indexOf and .LastIndexOf numbers are the same

        }

            System.out.println(result);


        System.out.println("------------------------");
        // now give me just the unique character, and nothing more

        String str2 = "aabbcddeeffggg";

        String uniqueChar = "";

        for (int i = 0; i < str2.length(); i++) {
            String ch = "" + str.charAt(i);

            if(str2.indexOf(ch) == str2.lastIndexOf(ch)) { // using == because we're comparing index numbers
                // Unique characters: when the .indexOf and .LastIndexOf numbers are the same
                uniqueChar += ch;
            }
        }


        System.out.println(uniqueChar);


        System.out.println("--------------------------------");

        // Here, retrieve the digits,letters, and special characters

        String digitLetterChar = "Cydeo12345School!@#$%&WoodenSpoon";
            // index number ----> 012345....
              // .lengths() ----> 123456....
        String digits = ""; // 112345
        String letters = ""; // CydeoSchoolWoodenSpoon
        String specialChar = ""; //!@#$%&

        for (int i = 0; i < digitLetterChar.length(); i++) { // i = index numbers of the original string(0 ~ last index)
           char ch2 = digitLetterChar.charAt(i); // each character in the string

            if(ch2 >= '0' && ch2 <= '9'){ // if any single character is between 1 or 9 it's a digit
                digits += ch2;
            }else if(ch2 >= 'A' && ch2 <= 'Z') { // if any single character is between A or Z it's a letter
                letters += ch2;
            } else if(ch2 >= 'a' && ch2 <= 'z'){ // if any single character is between a or z it's a letter
                letters += ch2;
            }else { // everything else is a special character. !@#$%....etc
                if(ch2 != ' '){ // if the character is not a space ' '
                    specialChar += ch2;
                }
            }


        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);


    }
}

/*
        3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */