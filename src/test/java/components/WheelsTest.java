package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void before(){
        wheels = new Wheels("regular");
    }

    @Test
    public void hasWheelType(){
        assertEquals("regular", wheels.getType());
    }

}