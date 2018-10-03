package vehicles;

import behaviours.Drivable;

public class ElectricCar extends Vehicle implements Drivable {

    public ElectricCar(String model, int price, String colour, int maxSpeed) {
        super(model, price, colour, maxSpeed);
    }

    public String drive(){
        return "Vroom.. slow and steady";
    }
}
