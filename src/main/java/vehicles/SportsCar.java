package vehicles;

import behaviours.Drivable;
import components.Chassis;
import components.Engine;
import components.Wheels;

public class SportsCar extends Vehicle implements Drivable {

    Engine engine;
    Wheels wheels;
    Chassis chassis;

    public SportsCar(String model, int price, String colour, int maxSpeed, Engine engine, Wheels wheels, Chassis chassis) {
        super(model, price, colour, maxSpeed);
        this.engine = engine;
        this.wheels = wheels;
        this.chassis = chassis;
    }

    public String drive(){
        return "Vroom Vroom! Super fast";
    }

    public String getEngine() {
        return engine.getEngineType();
    }

    public String getWheels() {
        return wheels.getType();
    }

    public String getChassis() {
        return chassis.getMaterial();
    }
}
