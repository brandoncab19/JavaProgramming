package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Pizza smallOrders = new Pizza('L', 4,
                    0);

            Pizza mediumOrders = new Pizza('M', 3,
                    2);

            Pizza largeOrders = new Pizza('L', 4,
                    5);
            pizzas.addAll(Arrays.asList(smallOrders, mediumOrders,
                    largeOrders));
        }

        System.out.println("Total number of pizzas = " + pizzas.size());
        double total = 0;

        for (Pizza eachpizza : pizzas){
            total += eachpizza.totalCost();
        }

        System.out.println("total = $" + total);

    }
}
