import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        boolean validity = true;
        do {
            System.out.print("Enter the phone number in the format +94 XX XXX XXXX or 0XX-XXXXXXX : ");
            input = scanner.nextLine();
            if (input.isBlank()) {
                System.out.println("Telephone number can't be empty");
                validity = false;
            } else {
                char[] charArray = input.toCharArray();

                for (int i = 0; i < charArray.length; i++) {
                    validity = Character.isDigit(charArray[i]) ? true : charArray[i] == '-' ? true : charArray[i] == ' ' ? true : charArray[i] == '+' ? true :  false;
                    if (!validity) {
                        System.out.println("Invalid Content");
                        break;
                    }
                }
            }
        } while (!validity);

        String[] number;
        if (input.startsWith("+94")) {
            number = input.split(" ");
            if (number[1].length() != 2 || number[1].contains("+") || number[1].contains("-") ||
                number[2].length() != 3 || number[2].contains("+") || number[2].contains("-") ||
                number[3].length() != 4 || number[3].contains("+") || number[3].contains("-"))
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        } else if (input.startsWith("0")) {
            number = input.split("-");
            if (number[0].length() != 3 || number[0].contains("+") || number[0].contains(" ") ||
                number[1].length() != 7 || number[1].contains("+") || number[1].contains(" "))
                System.out.println("Invalid phone number.");
            else
                System.out.println("Number is validated.");
        } else
            System.out.println("Invalid phone number.");

    }
}
