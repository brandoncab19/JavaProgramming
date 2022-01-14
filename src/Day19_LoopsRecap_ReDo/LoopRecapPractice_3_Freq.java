package Day19_LoopsRecap_ReDo;

public class LoopRecapPractice_3_Freq {
    public static void main(String[] args) {

        String str = "bbcdeeef";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (each == ch) {
                    count++;
                }

            }
            if (count == 2) {
                result += ch;
            }


        }

        System.out.println(result);

    }
}

/*
Tasks:
	DONE - 1. Write a program that can return the first duplicated character from a string
	2. Write a program that cna return the index number of the first duplicated character from a string
	3. Write a program that can display all the characters that appeared twice in the string.
	4. Write a program that can return the index number of the first unique character.
 */