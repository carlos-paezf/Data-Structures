package edu.usta.part04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FridgeTest {

    /**
     * The testDefaultConstructor method tests the default constructor of the Fridge
     * class by checking if the capacity is null.
     */
    @Test
    public void testDefaultConstructor() {
        Fridge fridge = new Fridge();
        assertNull(fridge.getCapacity());
    }

    /**
     * This test case verifies that the capacity of a Fridge object created using a
     * parameterized constructor is set correctly.
     */
    @Test
    public void testParameterizedConstructor() {
        Fridge fridge = new Fridge(1, "BrandA", 500.0, "10", 300);
        assertEquals(300, fridge.getCapacity());
    }

    /**
     * The testSetCapacity method tests the setCapacity and getCapacity methods of
     * the Fridge class in Java.
     */
    @Test
    public void testSetCapacity() {
        Fridge fridge = new Fridge();
        fridge.setCapacity(500);
        assertEquals(500, fridge.getCapacity());
    }

    /**
     * The testParentSetters method tests the setter methods of a Fridge object by
     * setting values and then asserting that the values are correctly retrieved.
     */
    @Test
    public void testParentSetters() {
        Fridge fridge = new Fridge();
        fridge.setCod(2);
        fridge.setBrand("BrandB");
        fridge.setValue(600.0);
        fridge.setAmount("20");

        assertEquals(2, fridge.getCod());
        assertEquals("BrandB", fridge.getBrand());
        assertEquals(600.0, fridge.getValue());
        assertEquals("20", fridge.getAmount());
    }
}
