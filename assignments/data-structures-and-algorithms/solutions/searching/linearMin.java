
import java.util.Scanner;

public class linearMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int min = findMin(nums);
        System.out.println("Min: " + min);
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
