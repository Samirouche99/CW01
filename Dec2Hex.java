import java.util.Scanner;

class Dec2Hex {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.err.println("Error: No input argument provided.");
            System.exit(1); // Exit with an error code
        }

        try {
            int num = Integer.parseInt(args[0]);
            if (num < 0) {
                System.err.println("Error: Input value must be a non-negative integer.");
                System.exit(1); // Exit with an error code
            }

            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);

        } catch (NumberFormatException e) {
            System.err.println("Error: Input must be a valid integer.");
            System.exit(1); // Exit with an error code
        }
    }
}

/* added exception handling */
