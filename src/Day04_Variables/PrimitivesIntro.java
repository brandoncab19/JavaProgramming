package day_04_Variables;

public class PrimitivesIntro {

   public static void main(String[] args) {

      // age: 38 yrs old
      byte age = 38;

      // weight: 185lbs
      //byte weight = 185; // 185 is out "byte" range

      short weight = 185; // 185 is within the "short" range

      // Yearly salary: 116,000 (116,000 is out of "short" range)
      int salery = 116000;
      // "int" is the preffered date type for Integer numbers

      long asset = 3_333_333_333L;
      /* "L" added to force the compilar to take the
      long data type in the integer value to be used.
       */

      // tax: 0.69
      double tax = 0.69;
      double PI = 3.14;
      float tax2 = 0.69F;

      // float tax2 = 0.69F;
      /* "F" added to force the compilar to take the
      long data type in the integer value to be used.
       */

      char ch1 = '#';
      System.out.println("ch1 = " + ch1);

      char ch2 = 35;
      System.out.println("ch2 = " + ch2);

      char ch3 = 35000;
      System.out.println("ch3 = " + ch3);

      char ch4 = 15000;
      System.out.println("ch4 = " + ch4);

      char gender = 'F';

      char grade = 'F';

      char yesNo = 'Y';

      System.out.println(yesNo);

      boolean isEmployeed = true;
      boolean ismarried = false;

      boolean result = 100 > 300;

      System.out.println("isEmployeed = " + isEmployeed);
      System.out.println("ismarried = " + ismarried);
      System.out.println("result = " + result);

      // EX: String name = "Wooden Spoon";
      String city = "Medellin";
      String Country = "Colombia";






   }
}
