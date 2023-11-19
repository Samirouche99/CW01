import static org.junit.Assert.assertEquals;
import java.util.logging.Logger;

public class Junit {

    private static final Logger logger = Logger.getLogger(Junit.class.getName());

    public static void main(String[] args) {
        // Run the test methods
        testConversionWithZero();
        testConversionWithPositiveNumber();
        testConversionWithNonIntegerInput();
    }

    // Test method for converting zero to hexadecimal
    public static void testConversionWithZero() {
        // Perform the conversion
        String result = Dec2Hex.convertToHex(0);
        // Check the result and log the status
        logger.info("Test Conversion with Zero: " + ("".equals(result) ? "Passed" : "Failed"));
    }

    // Test method for converting a positive number to hexadecimal
    public static void testConversionWithPositiveNumber() {
        // Perform the conversion
        String result = Dec2Hex.convertToHex(26);
        // Check the result and log the status
        logger.info("Test Conversion with Positive Number: " + ("1A".equals(result) ? "Passed" : "Failed"));
    }

    // Test method for handling non-integer input
    public static void testConversionWithNonIntegerInput() {
        try {
            // Try to convert a non-integer input
            Dec2Hex.convertToHex(Integer.parseInt("invalid"));
            // If no exception is thrown, log failure status
            logger.severe("Test Conversion with Non-Integer Input: Failed. Expected NumberFormatException, but no exception was thrown.");
        } catch (NumberFormatException e) {
            // If NumberFormatException is caught, log success status
            logger.info("Test Conversion with Non-Integer Input: Passed");
        }
    }
}

