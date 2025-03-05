package edu.usta.part03;

public class ArithmeticOperationsImplementation implements IArithmeticOperations {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int amountOfLetters(String text) {
        return text.length();
    }

}
