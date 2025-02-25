package edu.usta.part03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsImplementationTest {

    private final ArithmeticOperationsImplementation arithmeticOperations = new ArithmeticOperationsImplementation();

    @Test
    public void testAdd() {
        assertEquals(5, arithmeticOperations.add(2, 3));
        assertEquals(-1, arithmeticOperations.add(2, -3));
        assertEquals(0, arithmeticOperations.add(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, arithmeticOperations.divide(6, 3));
        assertEquals(-2, arithmeticOperations.divide(6, -3));
        assertThrows(ArithmeticException.class, () -> arithmeticOperations.divide(1, 0));
    }

    @Test
    public void testIsPrime() {
        assertFalse(arithmeticOperations.isPrime(1));
        assertTrue(arithmeticOperations.isPrime(2));
        assertTrue(arithmeticOperations.isPrime(3));
        assertFalse(arithmeticOperations.isPrime(4));
        assertTrue(arithmeticOperations.isPrime(5));
    }

    @Test
    public void testAmountOfLetters() {
        assertEquals(5, arithmeticOperations.amountOfLetters("Hello"));
        assertEquals(0, arithmeticOperations.amountOfLetters(""));
        assertEquals(11, arithmeticOperations.amountOfLetters("Hello World"));
    }
}
