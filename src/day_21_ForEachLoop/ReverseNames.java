package day_21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov",
                "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) {

            String reverse = "";

            for (int i = each.length()-1; i >= 0; i++) {
                reverse += each.charAt(i);
            }
            System.out.println(reverse);

        }



    }
}
