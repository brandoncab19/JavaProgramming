package Day14_StringMethod2_ReDo;

public class StringMethods_3 {
    public static void main(String[] args) {

        String str = "   batch 25   ";
// trim() gives you new String without the unused white spaces(usually before or after the string)
        str = str.trim(); // "batch 25"

        System.out.println(str);

        System.out.println("-----------------------------");

        String str1 = "Cydeo School";

        int n1 = str1.indexOf("h");

        int n2 = str1.indexOf("ool");
/*
 this method looks for the specific character(Just 1) entered starting from the left.
 Once the first matching character is found, it will print the index of that character
 */
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);


        String str2 = "Java programming all day!";
        int n3 = str2.indexOf("am");
        // make the search unique to find that character if theirs more than one of that specific character

        System.out.println("n3 = " + n3);

        System.out.println("-----------------------------");

        String str3 = "Ho ho ho, merry Christmas!";

        int firstY = str3.indexOf("rr") + 1; // another way of finding the index
        int secondM = str3.lastIndexOf("m");
                //   lastindexOf() --> looks for the specific character(Just 1) entered starting from the right.
        int thirdR = str3.lastIndexOf("ry");
        System.out.println("firstY = " + firstY);
        System.out.println("secondM = " + secondM);
        System.out.println("thirdR = " + thirdR);


    }
}
/*
charAt(index): returns the character at the given index, returns char

length(): returns the total number of characters, returns int

			last index: length() -1

toLowerCase(): returns new String in the lower case version of old string object

toUpperCase(): returns new String in the upper case version of old string object

trim(): returns new String without the white spaces (unused spaces)

indexOf(str): returns the index number of first occurred character. returns int

lastIndexOf(str): returns the index number of last occurred character. returns int

 */