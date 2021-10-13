package exceptionn;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {


//        try {
//            int[] numbers = {1, 2, 3};
//            System.out.println(numbers[5]);
//
//        } catch (IndexOutOfBoundsException boundsException) {
//            System.out.println("ERROR!!!! -> " + boundsException.getMessage());
//        } finally {
//            System.out.println("The try catch is completed.");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = scanner.nextInt();
            System.out.println("Number: " + number);

        } catch (InputMismatchException mismatchException) {
            System.out.println("ERROR!!!! -> " + "Input is NOT valid.");
        } finally {
            // in elk conditie voert JVM deze statements uit.
            System.out.println("The scanner is now being closed.");
            scanner.close();
        }


        MyClosableClass myClosable = new MyClosableClass();

        try {
            myClosable.sayHello("Justin", "Bieber");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            myClosable.close();
        }
    }
}
