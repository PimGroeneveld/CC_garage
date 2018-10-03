package vehicles;

import behaviours.Drivable;

public class SportsCar extends Vehicle implements Drivable {

    public SportsCar(String model, int price, String colour, int maxSpeed) {
        super(model, price, colour, maxSpeed);
    }

    public String drive(){
        return "Vroom Vroom! Super fast";
    }
}
