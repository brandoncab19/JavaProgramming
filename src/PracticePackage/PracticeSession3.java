package PracticePackage;

public class PracticeSession3 {
    public static void main(String[] args) {

        long a = 1000;
        short b = (short)a;

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------");

        String gameConsole = "Xbox Series s";
        int lowerCasex = gameConsole.indexOf("x ");

        int seocndToLastS = gameConsole.indexOf("s ") +1;

        System.out.println("lowerCasex = " + lowerCasex);

        System.out.println("seocndToLastS = " + seocndToLastS);

        System.out.println("-------------");

        String energyDrink = "Zoa with mana with teremana";
        int totalNumberOfChar = energyDrink.length()-1;
        System.out.println("totalNumberOfChar = " + totalNumberOfChar);
        int secondToLastE = energyDrink.lastIndexOf("er");
        System.out.println("secondToLastE = " + secondToLastE);
        int CountWithIndex = energyDrink.indexOf("na")+8;
        System.out.println("CountWithIndex = " + CountWithIndex);

        System.out.println("--------------------------");

        String test = "Zoa with mana with teremana";
        
       String subString1 = test.substring(test.indexOf("m"));
        System.out.println("subString1 = " + subString1);

        String subString2 = test.substring(0, 13);
        String subString3 = test.substring(test.indexOf("Z"), test.lastIndexOf("w")-1);
        String subString4 = test.substring(test.indexOf("m"), test.lastIndexOf("a ")+1);

        System.out.println("subString2 = " + subString2);
        System.out.println("subString3 = " + subString3);
        System.out.println("subString4 = " + subString4);

        System.out.println("-------------------------------");

        String test2 = "Teremana ";

        String repeatString = test2.repeat(3);
        System.out.println("repeatString = " + repeatString);

        System.out.println("----------------------------");

        System.out.println("FADY\n".repeat(15));

        System.out.println("-------------------------");

        String name = "Java";

        //  System.out.println(  name.repeat(5));

        System.out.println((name + " ").repeat(5));


    }
}
