package exceptionn;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloApp {

    public static void main(String[] args) {

//        Throwable throwable = new Throwable("This is my first exception");
//        throw throwable;

//        LocalDateTime now = LocalDateTime.now();
//        ChefsException chefsException = new ChefsException("This is an exception from ch€f", now);
//
//        throw chefsException;

        Keyboard keyboard = new Keyboard();

//        String text1 = keyboard.readText();
//        System.out.println("Text1: " + text1);
//
//        try {
//
//            String text2 = keyboard.readText(-5);
//            System.out.println("Text2: " + text2);
//
//        } catch (NegativeException negativeException) {
//
//            System.out.println(negativeException.getMessage());
//
//        }

        // ClassNotFoundException | IOException | SQLException

//        String text3 = keyboard.readText(null);
//        System.out.println("Text03: " + text3);


        String text4 = keyboard.readNumberAsText(null);
        System.out.println("Text04: " + text4);


    }
}
