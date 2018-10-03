package people;

import behaviours.Sellabe;
import store.Dealership;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<Sellabe> ownedCars;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.ownedCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public int getCars(){
        return this.ownedCars.size();
    }

    public void buyCar(Sellabe car, Dealership dealership){
        if(dealership.getCars().contains(car)){
            Sellabe newCar = dealership.sellCar(car);
            ownedCars.add(newCar);
            this.wallet -= car.price();
        }
    }
}
