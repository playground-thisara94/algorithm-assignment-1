import java.util.Scanner;

public class Algo_1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean validity = false;
        int num = 0;

        do {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();

            if (num > 0)
                validity = true;

        } while (!validity);

        int[] fibonacci = { 0, 1 };
        do {
            int[] newArray = new int[fibonacci.length + 1];

            for (int i = 0; i < fibonacci.length; i++) {
                newArray[i] = fibonacci[i];
            }

            newArray[newArray.length - 1] = (fibonacci[fibonacci.length - 1] + fibonacci[fibonacci.length - 2]);
            fibonacci = newArray;

        } while (fibonacci[fibonacci.length - 1] < num);

        System.out.print("Fibonacci Sequence up to " + num + " : ");
        for (int i = 0; i < fibonacci.length - 1; i++) {
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.println("\b\b ");

    }
}