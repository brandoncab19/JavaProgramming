package Day33_Statics;

public class StaffObjects {
    public static void main(String[] args) {

        Staff Staff1 = new Staff();
        Staff1.name = "Ahmet";
        Staff1.salary = 110000;

        Staff Staff2 = new Staff();
        Staff2.name = "Aygun";
        Staff2.salary = 115000;

        Staff Staff3 = new Staff();
        Staff3.name = "Fady";
        Staff3.salary = 120000;

        System.out.println( Staff1.name +" : "+Staff1.salary );
        System.out.println( Staff2.name +" : "+Staff2.salary);
        System.out.println( Staff3.name +" : "+Staff3.salary);


        System.out.println( Staff1.isHuman );
        System.out.println( Staff2.isHuman );
        System.out.println( Staff3.isHuman );


    }
}
