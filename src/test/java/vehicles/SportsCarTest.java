package vehicles;
import components.Engine;
import components.Wheels;
import components.Chassis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SportsCarTest {

    SportsCar sportsCar;
    Engine engine;
    Wheels wheels;
    Chassis chassis;

    @Before
    public void before(){
        engine = new Engine("Gasoline");
        wheels = new Wheels("Sport");
        chassis = new Chassis("Carbon steel");
        sportsCar = new SportsCar("Ferrari", 60000, "blue", 280, engine, wheels, chassis);
    }

    @Test
    public void hasModel(){
        assertEquals("Ferrari", sportsCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(60000, sportsCar.price());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", sportsCar.getColour());
    }

    @Test
    public void hasMaxSpeed(){
        assertEquals(280, sportsCar.getMaxSpeed());
    }

    @Test
    public void canDrive(){
        assertEquals("Vroom Vroom! Super fast", sportsCar.drive());
    }

    @Test
    public void getEngineType() {
        assertEquals("Gasoline", sportsCar.getEngine());
    }

    @Test
    public void getWheelType() {
        assertEquals("Sport", sportsCar.getWheels());
    }

    @Test
    public void getChassisMaterial() {
        assertEquals("Carbon steel", sportsCar.getChassis());
    }
}