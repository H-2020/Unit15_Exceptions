package exceptionn;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        System.out.println("Hello");

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(10, 20));
        System.out.println(calculator.min(10, 20));
        System.out.println(calculator.div(10, 20));
        System.out.println(calculator.mul(10, 20));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 decimals to divide: ");

        try {
            System.out.print(calculator.div(scanner.nextInt(), scanner.nextInt()));
        } catch (AlgebraException algebraException) {
            System.out.println("------- EXCEPTION EXCEPTION ----------");
            System.out.println(algebraException.getMessage());
            System.out.println("--------------------------------------");
        }

//        System.out.print(calculator.div(scanner.nextInt(), scanner.nextInt()));

        System.out.println("Goodbye");

    }
}
