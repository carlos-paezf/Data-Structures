package edu.usta.part04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApplianceTest {

    /**
     * The testDefaultConstructor method tests the default constructor of the
     * Appliance class by checking that the initial values of its attributes are
     * null.
     */
    @Test
    public void testDefaultConstructor() {
        Appliance appliance = new Appliance();
        assertNull(appliance.getCod());
        assertNull(appliance.getBrand());
        assertNull(appliance.getValue());
        assertNull(appliance.getAmount());
    }

    /**
     * The testParameterizedConstructor method tests the parameterized constructor
     * of the Appliance class by creating an instance with specific values and
     * asserting the expected values.
     */
    @Test
    public void testParameterizedConstructor() {
        Appliance appliance = new Appliance(1, "Samsung", 499.99, "10");
        assertEquals(1, appliance.getCod());
        assertEquals("Samsung", appliance.getBrand());
        assertEquals(499.99, appliance.getValue());
        assertEquals("10", appliance.getAmount());
    }

    /**
     * The testSettersAndGetters function tests the setters and getters of an
     * Appliance object in Java.
     */
    @Test
    public void testSettersAndGetters() {
        Appliance appliance = new Appliance();
        appliance.setCod(2);
        appliance.setBrand("LG");
        appliance.setValue(599.99);
        appliance.setAmount("5");

        assertEquals(2, appliance.getCod());
        assertEquals("LG", appliance.getBrand());
        assertEquals(599.99, appliance.getValue());
        assertEquals("5", appliance.getAmount());
    }

    /**
     * The testEqualsAndHashCode method tests the equals and hashCode methods of the
     * Appliance class with different instances.
     */
    @Test
    public void testEqualsAndHashCode() {
        Appliance appliance1 = new Appliance(1, "Samsung", 499.99, "10");
        Appliance appliance2 = new Appliance(1, "Samsung", 499.99, "10");
        Appliance appliance3 = new Appliance(2, "LG", 599.99, "5");

        assertEquals(appliance1, appliance2);
        assertNotEquals(appliance1, appliance3);
        assertEquals(appliance1.hashCode(), appliance2.hashCode());
        assertNotEquals(appliance1.hashCode(), appliance3.hashCode());
    }

    /**
     * The testToString method tests the toString method of the Appliance class by
     * creating an instance of Appliance and comparing its string representation
     * with an expected value.
     */
    @Test
    public void testToString() {
        Appliance appliance = new Appliance(1, "Samsung", 499.99, "10");
        String expected = "Appliance [cod=1, brand=Samsung, value=499.99, amount=10]";
        assertEquals(expected, appliance.toString());
    }
}
