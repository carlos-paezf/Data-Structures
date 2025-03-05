package edu.usta.part04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TVTest {

    private TV tv1;
    private TV tv2;

    /**
     * The setUp function initializes two TV objects with specific attributes.
     */
    @BeforeEach
    public void setUp() {
        tv1 = new TV(1, "Samsung", 499.99, "10", 55);
        tv2 = new TV(2, "LG", 599.99, "5", 65);
    }

    /**
     * The testGetInches function tests the getInches method of two TV objects to
     * ensure they return the correct inch values.
     */
    @Test
    public void testGetInches() {
        assertEquals(55, tv1.getInches());
        assertEquals(65, tv2.getInches());
    }

    /**
     * The testSetInches function tests setting the inches of a TV object to 60 and
     * then asserts that the inches value is 60.
     */
    @Test
    public void testSetInches() {
        tv1.setInches(60);
        assertEquals(60, tv1.getInches());
    }

    /**
     * The testHashCode function compares the hash codes of two TV objects to check
     * for equality.
     */
    @Test
    public void testHashCode() {
        TV tv3 = new TV(1, "Samsung", 499.99, "10", 55);
        assertEquals(tv1.hashCode(), tv3.hashCode());
        assertNotEquals(tv1.hashCode(), tv2.hashCode());
    }
}
