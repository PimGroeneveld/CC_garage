import behaviours.Drivable;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Drivable> cars;
    private String name;

    public Dealership(String name){
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCars() {
        return this.cars.size();
    }

    public void add(Drivable car){ //polymorphism
        this.cars.add(car);
    }
}
