package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar("Prius", 20000, "green", 140);
    }

    @Test
    public void hasModel(){
        assertEquals("Prius", electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(20000, electricCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("green", electricCar.getColour());
    }

    @Test
    public void hasMaxSpeed(){
        assertEquals(140, electricCar.getMaxSpeed());
    }

}