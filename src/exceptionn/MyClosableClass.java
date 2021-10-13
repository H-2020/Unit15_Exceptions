package exceptionn;

import java.io.Closeable;
import java.io.IOException;

public class MyClosableClass implements Closeable {

    private String text;
    private int number;

    public void sayHello(String firstName, String lastName) throws Exception {

        if (firstName.isEmpty() || lastName.isEmpty()) {
            Exception exception = new Exception("First name and last name cannot be empty");
            throw exception;
        }

        System.out.println("Hello" + firstName + " " + lastName);
    }

    // METHOD_OVERRIDE_FROM_CLOSEABLE
    public void close() {
        this.text = "";
        this.number = 0;
    }
}
