package Day21_ForEachLoop_ReDo;

public class ForEachLoopPractice_2 {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School",
                "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String eachWord : words) {
//New data type should alwasy be the same as the datatype its taking each data structure from
            System.out.println("" + eachWord.charAt(0) + '.' + eachWord.charAt(eachWord.length() - 1));
        }

        System.out.println("-----------------------------------");

        String[] word2 = {"Brandon Cabrera","John Cena",
                "Dwayne Johnson", "Anton Smirnov"};

        for (String s : word2) {
            System.out.println("" + s.charAt(0) + '.' + s.charAt(s.length()-1));
        }
        System.out.println("---------------------------------------");

        String[] word3 = {"Brandon Cabrera","John Cena",
                "Dwayne Johnson", "Anton Smirnov"};

        for (String each : word3){
        System.out.println("" + each.charAt(0) + '.' + each.charAt(each.indexOf(" ")+1));
        }

        System.out.println("--------------------------------");
                // Reverse the names
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya",
                "Begench Begenjov", "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers",
                "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { // each: "Elminur Ablimit", "Ali Kilic", "Hulya Keles" ....

            String reversed = "";

            for (int i = each.length()-1; i>= 0; i--) { // reverses the string
                reversed += each.charAt(i);
            }

            System.out.println(reversed);

        }

    }
}
