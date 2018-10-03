import components.Chassis;
import components.Engine;
import components.Wheels;
import org.junit.Before;
import org.junit.Test;
import store.Dealership;
import vehicles.ElectricCar;
import vehicles.SportsCar;

import static org.junit.Assert.*;

public class DealershipTest {

    SportsCar sportsCar;
    Engine engine1;
    Wheels wheels1;
    Chassis chassis1;
    Engine engine2;
    Wheels wheels2;
    Chassis chassis2;
    ElectricCar electricCar;
    Dealership dealership;

    @Before
    public void before(){
        engine1 = new Engine("Gasoline");
        wheels1 = new Wheels("Sport");
        chassis1 = new Chassis("Carbon steel");
        sportsCar = new SportsCar("Ferrari", 60000, "blue", 280, engine1, wheels1, chassis1);
        engine2 = new Engine("Electric");
        wheels2 = new Wheels("Biodegradable");
        chassis2 = new Chassis("Leaves");
        electricCar = new ElectricCar("Prius", 20000, "green", 140, engine2, wheels2, chassis2);
        dealership = new Dealership("Two Car Garage");
    }

    @Test
    public void dealershipHasName(){
        assertEquals("Two Car Garage", dealership.getName());
    }

    @Test
    public void dealershipCanAddCars(){
        dealership.add(sportsCar);
        assertEquals(1, dealership.getCarCount());
    }

    @Test
    public void dealershipCanSellCars(){
        dealership.add(electricCar);
        dealership.sellCar(electricCar);
        assertEquals(electricCar, dealership.sellCar(electricCar));
    }

    @Test
    public void dealershipCanRemoveCars(){
        dealership.add(sportsCar);
        dealership.add(electricCar);
        dealership.sellCar(electricCar);
        assertEquals(1, dealership.getCarCount());
    }

}