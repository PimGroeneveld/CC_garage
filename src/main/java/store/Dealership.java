package store;

import behaviours.Drivable;
import behaviours.Sellabe;
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

    public int getCarCount() {
        return this.cars.size();
    }

    public ArrayList<Drivable> getCars() {
        return cars;
    }

    public void add(Drivable car){ //polymorphism
        this.cars.add(car);
    }

    public Sellabe sellCar(Sellabe car){ //polymorphism
        this.cars.remove(car);
        return car;
    }
}
