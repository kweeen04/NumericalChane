import java.util.Scanner;

public class Validation {
    private static Scanner in = new Scanner(System.in);
    private static String VALID_BINARY = "[0-1]*";
    private static String VALID_DECIMAL = "[0-9]*";
    private static String VALID_HEXADECIMAL = "[0-9A-F]*";

    public static int checkInput(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please enter number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }


    public static String validBinary() {
        System.out.print("Enter binary number: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(VALID_BINARY)) {
                return result;
            }
            System.err.println("Number must be 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public static String validDecimal() {
        System.out.print("Enter decimal number: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(VALID_DECIMAL)) {
                return result;
            }
            System.err.println("Number must be 0-9");
            System.out.print("Enter again: ");
        }
    }

    public static String validHexadecimal() {
        System.out.print("Enter Hexadecimal number: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(VALID_HEXADECIMAL)) {
                return result;
            }
            System.err.println("Number must be 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }
}