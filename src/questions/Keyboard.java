package questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {

    private Scanner scanner = new Scanner(System.in);

    public String readNumberAsText(Double number) {
        return String.valueOf(number);
    }

    public String readText(String textToAppend) {
        return textToAppend + " -> " + scanner.nextLine();
    }

    public String readText() {
        return scanner.nextLine();
    }

    // throws TheNameOfExceptionHandler
    public String readText(int maxLength) throws NegativeException {
        if (maxLength < 0) {
//            ChefsException chefsException = new ChefsException("Max length must be POSITIVE!", LocalDateTime.now());
//            throw chefsException;

//            Exception exception = new Exception("Max length must be POSITIVE!");
//            throw exception;

            NegativeException negativeException = new NegativeException("Max length must be POSITIVE!");
            throw negativeException;
        }

        return scanner.nextLine().substring(0, maxLength);
    }

    public int readNumber() throws NegativeException,InvalidInputException{
        Scanner scanner=new Scanner(System.in);
        try{
        int number=scanner.nextInt();
        if(number<0){
            NegativeException negativeException = new NegativeException("Number must be POSITIVE!");
            throw negativeException;

        }

        return number;}
        catch(InputMismatchException inputMismatchException){
          //  InvalidInputException invalidInputException=new InvalidInputException("Invalid input!!!");
          //  throw invalidInputException;
            throw inputMismatchException;
        }
    }

}
