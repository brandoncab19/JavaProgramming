package day_04_Variables;
/*
 2. Create a class named Rectangle, write a program that can calculate the
 area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */
public class Rectangle {

    public static void main(String[] args) {
        // length, width, area, perimeter
        double legnth = 5.5;
        double width = 10.5;

        double area = legnth * width;
        double perimeter = 2 * (legnth + width);

        System.out.println("legnth = " + legnth);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
