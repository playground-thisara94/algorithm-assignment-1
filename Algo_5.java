import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String text = "";
        boolean validity = false;
        do {
            System.out.print("Enter a text: ");
            text = scanner.nextLine().strip();

            validity = true;
            if(text.length() == 0) {
                System.out.println("Invalid text");
                validity = false;
            }


        } while(!validity);

        char[] charArray = text.toCharArray();
        System.out.print("The reversed text : ");
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();

    }
}
