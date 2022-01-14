package Day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int month = 3;

        String nameOfMonth = (month == 1) ? "Jan" : (month == 2) ? "Feb" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May"
                : (month == 6) ? "June" : (month == 7) ? "July" : (month == 8) ? "Aug" : (month == 9) ? "Sept" : (month == 10) ? "Oct"
                : (month == 11) ? "Nov" : "Dec";
        System.out.println(nameOfMonth);
    }
}
