public class ChangingSystem {
    public static char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexadecimal.");
        System.out.println("4. Exit");
        System.out.println("Enter selection: ");
        int choice = Validation.checkInput(1,4);
        return choice;
    }

    public static int display(String from, String to1, String to2) {
        System.out.println("1. Convert form " + from + "to " + to1);
        System.out.println("1. Convert form " + from + "to " + to2);
        System.out.print("Enter selection: ");
        int result = Validation.checkInput(1, 2);
        return result;
    }

    public static void convertFromBinary(String binary) {
        int choice = display("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + convertBinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadimal: " + convertBinaryToHexadecimal(binary));
                break;
        }
    }

    public static void convertFromDecimal(String decimal) {
        int choice = display("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertDecimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertDecimalToHexaDecimal(decimal));
                break;
        }
    }

    public static void convertFromHexadecimal(String hexadecimal) {
        int choice = display("hexadecimal", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertHexadecimalToBinary(hexadecimal));
                break;
            case 2:
                System.out.println("Decimal: " + convertHexadecimalToDecimal(hexadecimal));
                break;
        }
    }

    public static String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public static String convertBinaryToHexadecimal(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        String hexadecimal = convertBinaryToHexadecimal(decimal);
        return hexadecimal;
    }

    public static int convertHexadecimalToDecimal(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }

    public static String convertHexadecimalToBinary(String hexadecimal) {
        String binary = Integer.toBinaryString(convertHexadecimalToDecimal(hexadecimal));
        return binary;
    }

    public static String convertDecimalToBinary(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    public static String convertDecimalToHexaDecimal(String decimal) {
        String hexadecimal = "";
        int decimal1 = Integer.parseInt(decimal);
        while (decimal1 != 0) {
            hexadecimal = hexDigits[decimal1 % 16] + hexadecimal;
            decimal1 /= 16;
        }
        return hexadecimal;
    }
}
