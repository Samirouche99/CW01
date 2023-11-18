import static org.junit.Assert.assertEquals;

public class Junit {

    public static void main(String[] args) {
        // Run the test methods
        testConversionWithZero();
        testConversionWithPositiveNumber();
        testConversionWithNonIntegerInput();
        // Add more test methods as needed
    }

    // Test method for converting zero to hexadecimal
    public static void testConversionWithZero() {
        // Perform the conversion
        String result = Dec2Hex.convertToHex(0);
        // Check the result and print the status
        System.out.println("Test Conversion with Zero: " + ("".equals(result) ? "Passed" : "Failed"));
    }

    // Test method for converting a positive number to hexadecimal
    public static void testConversionWithPositiveNumber() {
        // Perform the conversion
        String result = Dec2Hex.convertToHex(26);
        // Check the result and print the status
        System.out.println("Test Conversion with Positive Number: " + ("1A".equals(result) ? "Passed" : "Failed"));
    }

    // Test method for handling non-integer input
    public static void testConversionWithNonIntegerInput() {
        try {
            // Try to convert a non-integer input
            Dec2Hex.convertToHex(Integer.parseInt("invalid"));
            // If no exception is thrown, print failure status
            System.out.println("Test Conversion with Non-Integer Input: Failed. Expected NumberFormatException, but no exception was thrown.");
        } catch (NumberFormatException e) {
            // If NumberFormatException is caught, print success status
            System.out.println("Test Conversion with Non-Integer Input: Passed");
        }
    }

}

