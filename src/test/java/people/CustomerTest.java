package people;

import components.Chassis;
import components.Engine;
import components.Wheels;
import org.junit.Before;
import org.junit.Test;

import store.Dealership;
import vehicles.SportsCar;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Dealership dealership;
    SportsCar sportsCar;
    Engine engine1;
    Wheels wheels1;
    Chassis chassis1;

    @Before
    public void before(){
        engine1 = new Engine("Gasoline");
        wheels1 = new Wheels("Sport");
        chassis1 = new Chassis("Carbon steel");
        sportsCar = new SportsCar("Ferrari", 60000, "blue", 280, engine1, wheels1, chassis1);
        dealership = new Dealership("Two Car Garage");
        customer = new Customer("Macho Mark", 80000);
    }

    @Test
    public void canGetName(){
        assertEquals("Macho Mark", customer.getName());
    }

    @Test
    public void canGetMonies(){
        assertEquals(80000, customer.getWallet());
    }

    @Test
    public void canBuyCar(){
        dealership.add(sportsCar);
        customer.buyCar(sportsCar, dealership);
        assertEquals(1, customer.getCars());
        assertEquals(20000, customer.getWallet());
    }

}