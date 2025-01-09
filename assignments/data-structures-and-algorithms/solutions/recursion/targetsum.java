
import java.util.Scanner;

public class targetsum {

    public static int findTargetSumWays(int[] nums, int target) {
        return calculateWays(nums, target, 0, 0);
    }

    private static int calculateWays(int[] nums, int target, int index, int currentSum) {
        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        int add = calculateWays(nums, target, index + 1, currentSum + nums[index]);
        int subtract = calculateWays(nums, target, index + 1, currentSum - nums[index]);
        return add + subtract;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target:");
        int target = scanner.nextInt();

        int result = findTargetSumWays(nums, target);
        System.out.println("Number of ways to reach the target: " + result);
    }
}
