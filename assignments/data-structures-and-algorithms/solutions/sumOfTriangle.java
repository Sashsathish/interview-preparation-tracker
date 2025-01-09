
import java.util.*;

public class sumOfTriangle {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        printTri(num);
    }

    public static void printTri(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int[] ns = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            int n = nums[i] + nums[i + 1];
            ns[i] = n;
        }
        printTri(ns);

        System.out.println(Array.toString(nums));
    }
}
