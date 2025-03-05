package edu.usta.part01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BasicExercisesTest {

    /**
     * The testCountCharacters function tests the countCharacters method in the
     * BasicExercises class with different input strings and expected character
     * counts.
     */
    @Test
    public void testCountCharacters() {
        BasicExercises exercise = new BasicExercises();
        assertEquals(5, exercise.countCharacters("Hello"));
        assertEquals(0, exercise.countCharacters(""));
        assertEquals(11, exercise.countCharacters("Hello World"));
    }

    /**
     * The testGetLargestNumber function tests the getLargestNumber method in the
     * BasicExercises class with different input values.
     */
    @Test
    public void testGetLargestNumber() {
        BasicExercises exercise = new BasicExercises();
        assertEquals(3, exercise.getLargestNumber(1, 2, 3));
        assertEquals(5, exercise.getLargestNumber(5, 5, 5));
        assertEquals(10, exercise.getLargestNumber(10, 2, 3));
    }

    /**
     * The testToUpperCase function tests the toUpperCase method of the
     * BasicExercises class by checking if it correctly converts strings to
     * uppercase.
     */
    @Test
    public void testToUpperCase() {
        BasicExercises exercise = new BasicExercises();
        assertEquals("HELLO", exercise.toUpperCase("hello"));
        assertEquals("WORLD", exercise.toUpperCase("world"));
        assertEquals("", exercise.toUpperCase(""));
    }

    /**
     * The test ensures that the getRandomVectorForNWithRange method in
     * BasicExercises generates a list of integers within a specified range for a
     * given size.
     */
    @Test
    public void testGetRandomVectorForNWithRange() {
        BasicExercises exercise = new BasicExercises();
        List<Integer> vector = exercise.getRandomVectorForNWithRange(5);
        assertEquals(5, vector.size());
        for (int num : vector) {
            assertTrue(num >= 100 && num <= 500);
        }
    }
}
