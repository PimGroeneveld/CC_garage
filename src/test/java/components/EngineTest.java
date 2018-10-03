package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Gasoline");
    }

    @Test
    public void hasEngineType(){
        assertEquals("Gasoline", engine.getEngineType());
    }

}