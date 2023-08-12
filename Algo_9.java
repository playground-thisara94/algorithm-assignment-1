import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean validity = false;
        String word = "";
        char[] charArray = { ' ' };

        do {
            System.out.print("Enter a single word: ");
            word = scanner.nextLine().strip();
            validity = true;

            if (word.length() == 0) {
                System.out.println("Invalid");
                validity = false;
            } else {
                charArray = word.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == ' ') {
                        System.out.println("Invalid");
                        validity = false;
                    }
                }
            }

        } while (!validity);

        boolean isPalindrome = true;
        loop: for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - (i + 1)]) {
                System.out.println("Word is not a Palindrome");
                isPalindrome = false;
                break loop;
            }
        }
        if (isPalindrome)
            System.out.println("Word is Palindrome");

    }
}
