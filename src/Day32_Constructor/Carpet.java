package Day32_Constructor;

public class Carpet {

    // Instance variable means each object has its own copy of the variable
    public double length, width, unitPrice;
    public boolean isPersian;

    public Carpet(double length, double width, double unitPrice,
                  boolean isPersian) {

     // this. keyword represents the instance variables of the class
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calCost(){

        double totalCarpetPrice = (width * length) * unitPrice;

        if(isPersian == true){
            totalCarpetPrice += 200.0;
        }
        return totalCarpetPrice;
    }

    public String toString() {
        return "Carpet{" +
                "length=" + length +
                ", width=" + width +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price = $" + calCost() +
                '}';
    }
}
/*
warmup task:
	1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of
                    the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */