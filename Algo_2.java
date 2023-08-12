public class Algo_2 {
    public static void main(String[] args) {

        int[] nums = { -5, 2, 7, 10, 58, -7, 8, 23 };

        int smallest = 100;
        int largest = -100;

        for (int i = 0; i < nums.length; i++) {
            largest = (nums[i] > largest) ? nums[i] : largest;
            smallest = (nums[i] < smallest) ? nums[i] : smallest;
        }

        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);

    }
}
