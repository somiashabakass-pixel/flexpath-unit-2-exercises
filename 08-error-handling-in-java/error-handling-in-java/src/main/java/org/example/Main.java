package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {
    /**
     * Divide two numbers safely.  If the result is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */


    public static double safeDivision(double a, double b){ try {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }catch (ArithmeticException e) {
        return 0;
    }
    }

    /**
     * Get the second letter of a string.
     *
     * @param s String to get the second letter from
     * @param logMessages List of log messages to add to
     * @return The second letter of the string
     */
    public static String getSecondLetter(String s, List<String> logMessages) {
        String result = "";

        try {
            result = s.substring(1, 2);
        } catch (StringIndexOutOfBoundsException e) {
            result = "";
        } finally {
            logMessages.add("Exiting method");
        }
        return result;}




    /**
     * Read a fake file and return its contents.
     *
     * @param logMessages List of log messages to add to
     * @return The contents of the faked file
     */
    public static String readFile(List<String> logMessages) {
        // TODO: Initialize the FakeFileReader in a try-with-resources block to make sure it closes and updates the logMessages list
        try (FakeFileReader reader = new FakeFileReader(logMessages)) {
            return reader.read();
        }

    }

    /**
     * Safely divide two numbers.  If the denominator is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivideWithCustomException(double a, double b) throws CustomDivideByZeroException {
        if (b == 0) {
            throw new CustomDivideByZeroException(a, b);
        }
        return a / b;
        }
        // TODO: handle divide by zero by throwing a CustomDivideByZeroException
        // TODO: Modify the custom exception to pass a,b to the constructor and store them in the exception (see CustomDivideByZeroException.java)


}
