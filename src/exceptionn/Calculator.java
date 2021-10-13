package exceptionn;

public class Calculator {

    public int sum(int number1, int number2) {
        return (number1 + number2);
    }

    public int min(int number1, int number2) {
        return (number1 - number2);
    }

    public int div(int number1, int number2) throws AlgebraException {
        if (number2 == 0) {
            AlgebraException algebraException = new AlgebraException("2nd number can never be 0 (zero)");
            throw algebraException;
        }

        return (number1 / number2);
    }

    public int mul(int number1, int number2) {
        return (number1 * number2);
    }

}
