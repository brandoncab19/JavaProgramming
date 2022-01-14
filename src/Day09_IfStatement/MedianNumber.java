package Day09_IfStatement;
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */

public class MedianNumber {
    public static void main(String[] args) {
        int a = 21,
                b = 68,
                c = 47;
        // If given 3 diffirent numbers. One must be maxium and one must be minimum.

        boolean aIsTheMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsTheMedian = (b > c && b < a) || (b > a && b < c);
        boolean cIsTheMedian = !aIsTheMedian && !bIsTheMedian;
                            // (c > a && c < b) || (c > b && c < a)

        if(aIsTheMedian){
            System.out.println(a + " is the median number");

        }

        if(bIsTheMedian){
            System.out.println(b + " is the median number");

        }

        if(cIsTheMedian){
            System.out.println(c + " is the median number");
        }



    }
}
