import components.Chassis;
import components.Engine;
import components.Wheels;
import org.junit.Before;
import org.junit.Test;
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
        engine2 = new Engine("Gasoline");
        wheels2 = new Wheels("Sport");
        chassis2 = new Chassis("Carbon steel");
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
        assertEquals(1, dealership.getCars());
    }

}