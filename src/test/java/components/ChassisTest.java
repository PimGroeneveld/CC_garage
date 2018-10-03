package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChassisTest {

    Chassis chassis;

    @Before
    public void before() {
        chassis = new Chassis("metal");
    }

    @Test
    public void hasChassisType(){
        assertEquals("metal", chassis.getMaterial());
    }
}