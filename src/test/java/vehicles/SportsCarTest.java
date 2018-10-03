package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SportsCarTest {

    SportsCar sportsCar;

    @Before
    public void before(){
        sportsCar = new SportsCar("Ferrari", 60000, "blue", 280);
    }

    @Test
    public void hasModel(){
        assertEquals("Ferrari", sportsCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(60000, sportsCar.getPrice());
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

}