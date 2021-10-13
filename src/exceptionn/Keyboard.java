package exceptionn;

import java.time.LocalDateTime;
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

    public double readNumber() {
        return scanner.nextDouble();
    }

}
