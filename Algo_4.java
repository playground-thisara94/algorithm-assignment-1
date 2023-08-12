public class Algo_4 {
    public static void main(String[] args) {
        
        int[] nums = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < nums.length/2; i++) {
            int element = nums[nums.length - 1 - i];
            nums[nums.length-1-i] = nums[i];
            nums[i] = element;
        }

        System.out.print("nums array = {");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b}");

    }
}
