package Day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void carInfo (String carBrand, String carModel, String carColor,
                         int carYear, double carPrice){

        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

    public void start(){
        System.out.println(brand + " Started its engine");
    }

    public void drive(){
        System.out.println(brand + " is on the move");
    }

    public void stop(){
        System.out.println(brand + " is stopping");
    }



}

/*
Car Class:
	Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()
 */