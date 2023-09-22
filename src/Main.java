public class Main {
    public static void main(String[] args) {
            while (true) {
                int choice = ChangingSystem.menu();
                switch (choice) {
                    case 1:
                        String binary = Validation.validBinary();
                        ChangingSystem.convertFromBinary(binary);
                        break;
                    case 2:
                        String decimal = Validation.validDecimal();
                        ChangingSystem.convertFromDecimal(decimal);
                        break;
                    case 3:
                        String hexadecimal = Validation.validHexadecimal();
                        ChangingSystem.convertFromHexadecimal(hexadecimal);
                        break;
                    case 4:
                        return;
                }
            }
    }
}
