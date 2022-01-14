package Day34_GarbageCollection_AccessModifiers;

public class Conductors_VS_staticBlock {
    static{
        System.out.println("Static Block");
    }

    public Conductors_VS_staticBlock(){
        System.out.println("Constructor");
        // Requires an object to print
    }

    public static void main(String[] args) {

        new Conductors_VS_staticBlock(); //1
        new Conductors_VS_staticBlock(); //2
        new Conductors_VS_staticBlock(); //3
        new Conductors_VS_staticBlock(); //4
        new Conductors_VS_staticBlock(); //5

    }
}
