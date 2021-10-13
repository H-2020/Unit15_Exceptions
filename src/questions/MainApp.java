package questions;

import java.util.InputMismatchException;

public class MainApp {
    public static void main(String[] args) {

        Keyboard keyboard=new Keyboard();

        try {
            System.out.println("Enter a number:");
            int number1 = keyboard.readNumber();
            System.out.println("Enter the second number:");
            int number2 = keyboard.readNumber();
            System.out.println("number1:" + number1);
            System.out.println("number2:" + number2);

        }
        catch (NegativeException negativeException) {
            System.out.println("Compiletime exception:"+negativeException.getMessage());

        }
        //catch (InvalidInputException invalidInputException) {
        //    System.out.println("Runtime exception:"+invalidInputException.getMessage());

        //}
        catch (InputMismatchException inputMismatchException){
            System.out.println("Input mismatch "+inputMismatchException.getMessage());
        }

    }
}
