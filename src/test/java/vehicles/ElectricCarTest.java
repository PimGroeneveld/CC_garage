package vehicles;

import components.Chassis;
import components.Engine;
import components.Wheels;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Wheels wheels;
    Chassis chassis;

    @Before
    public void before(){
        engine = new Engine("Electric");
        wheels = new Wheels("Biodegradable");
        chassis = new Chassis("Leaves");
        electricCar = new ElectricCar("Prius", 20000, "green", 140, engine, wheels, chassis);
    }

    @Test
    public void hasModel(){
        assertEquals("Prius", electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(20000, electricCar.price());
    }

    @Test
    public void hasColour(){
        assertEquals("green", electricCar.getColour());
    }

    @Test
    public void hasMaxSpeed(){
        assertEquals(140, electricCar.getMaxSpeed());
    }

    @Test
    public void canDrive(){
        assertEquals("Vroom.. slow and steady", electricCar.drive());
    }

    @Test
    public void getEngineType() {
        assertEquals("Electric", electricCar.getEngine());
    }

    @Test
    public void getWheelType() {
        assertEquals("Biodegradable", electricCar.getWheels());
    }

    @Test
    public void getChassisMaterial() {
        assertEquals("Leaves", electricCar.getChassis());
    }

}