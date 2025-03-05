/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.usta.part01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cpaez
 */
public class BasicExercises {

    /**
     * Create a function that receives a string and returns the number of characters
     * in the string.
     * 
     * @param text The string to count the characters
     * @return The number of characters in the string
     */
    public int countCharacters(String text) {
        return text.length();
    }

    /**
     * Create a function that receives three integers and returns the largest
     * number.
     * 
     * @param a The first number
     * @param b The second number
     * @param c The third number
     * @return The largest number
     */
    public int getLargestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Create a function that receives a string and returns the string in uppercase.
     * 
     * @param text The string to convert to uppercase
     * @return The string in uppercase
     */
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    /**
     * Create a function that receives a int n and returns a vector with size n, the
     * saves values by the vector are random numbers between 100 and 500.
     * 
     * @param n The size of the vector
     * @return A vector with random numbers between 100 and 500
     */
    public List<Integer> getRandomVectorForNWithRange(int n) {
        List<Integer> vector = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vector.add((int) (Math.random() * 400) + 100);
        }
        return vector;
    }
}
