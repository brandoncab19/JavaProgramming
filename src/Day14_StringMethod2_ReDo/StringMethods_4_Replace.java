package Day14_StringMethod2_ReDo;

public class StringMethods_4_Replace {
    public static void main(String[] args) {

        String email = "BrandonFCab@yahoo.com";
        email = email.replace("yahoo.com", "gmail.com");
 // the ".replace()" changes the selected characters, and replaces it with a new assigned character.

        System.out.println("email = " + email);

        System.out.println("---------------------------------");
        
        String takeout = "chicken wings wings wings wings strips";
        System.out.println("takeout = " + takeout);

        takeout = takeout.replace("wings", "");
        System.out.println("takeout = " + takeout);

        takeout = takeout.replace("    ", "");
        System.out.println("takeout = " + takeout);

        System.out.println("---------------------------------");

        String str2 = "dogs are amazing, dogs are cool";
        str2 = str2.replace(" dogs", " cats");
        // to uniquely replace one string of many of the same strings
        // This is wear replaceFirst may come in handy

        System.out.println("str2 = " + str2);

        System.out.println("---------------------------------");

        String trip = "york york city";
       trip = trip.replaceFirst("york", "new");
/* .replaceFirst() replaces only the assigned string thats found first. regardless if
there are other identical strings
 */
        System.out.println("trip = " + trip);

        trip =  trip.replaceFirst("ty", "to");

        System.out.println("trip = " + trip);


    }
}
/*
replace(oldValue, newValue): returns new string by
repalcing the old values with the given new value
 */