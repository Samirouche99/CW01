// This class converts a decimal integer to its hexadecimal representation
public class Dec2Hex {

    // Main method to be executed when running the program
    public static void main(String args[]) {
        // Check if an input is provided
        if (args.length == 0) {
            System.err.println("Error: No input provided. Please provide an integer as input.");
            System.exit(1); // Exit with an error code
        }

        try {
            // Parse the input as an integer
            int input = Integer.parseInt(args[0]);
            // Convert the integer to hexadecimal
            String hexadecimal = convertToHex(input);
            // Print the hexadecimal representation
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-integer)
            System.err.println("Error: Invalid input. Please provide a valid integer.");
            System.exit(1); // Exit with an error code
        }
    }

    // Converts a decimal integer to its hexadecimal representation
    public static String convertToHex(int decimal) {
        // Array representing hexadecimal digits
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexadecimal = "";

        // Loop to perform the conversion
        while (decimal != 0) {
            rem = decimal % 16;
            hexadecimal = ch[rem] + hexadecimal;
            decimal = decimal / 16;
        }

        // Return the hexadecimal representation
        return hexadecimal;
    }
}

