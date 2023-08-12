import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean validity = false;
        String sentence = "";

        do {
            System.out.print("Enter a sentence: ");
            sentence = scanner.nextLine().strip();
            validity = true;

            if (sentence.length() == 0) {
                System.out.println("Invalid sentence");
                validity = false;
            }
        } while (!validity);

        sentence = sentence + " ";

        char[] charArray = sentence.toCharArray();
        String[] wordsArray = new String[0];
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            String word = "";
            String[] newArray = new String[wordsArray.length + 1];
            if (charArray[i] == ' ') {
                for (int j = count; j < i; j++) {
                    word += charArray[j];
                }
                count = i;
                for (int j = 0; j < wordsArray.length; j++) {
                    newArray[j] = wordsArray[j];
                }
                newArray[newArray.length - 1] = word.strip();
                wordsArray = newArray;
            }

        }
        for (int k = wordsArray.length - 1; k >= 0; k--) {
            System.out.print(wordsArray[k] + " ");
        }
        System.out.println();

    }
}
