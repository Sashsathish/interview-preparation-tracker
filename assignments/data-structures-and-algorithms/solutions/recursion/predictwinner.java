
import java.util.Scanner;

public class predictwinner {

    public static boolean predictTheWinner(int[] nums) {
        return canWin(nums, 0, nums.length - 1, 1) >= 0;
    }

    private static int canWin(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int pickStart = nums[start] * turn + canWin(nums, start + 1, end, -turn);
        int pickEnd = nums[end] * turn + canWin(nums, start, end - 1, -turn);
        return Math.max(pickStart * turn, pickEnd * turn) * turn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = predictTheWinner(nums);
        System.out.println("Can Player 1 win? " + result);
    }
}
