public class Algo_8_2 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        System.out.print("numA \u222A numB : ");
        for (int i = 0; i < numA.length; i++) {
            System.out.print(numA[i]+", ");
        }
        loop:
        for (int i = 0; i < numB.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if(numB[i] == numA[j]) continue loop;
            }
            System.out.print(numB[i]+", ");
        }
        System.out.println("\b\b ");

    }
}
