<<<<<<< HEAD

import java.util.Scanner;

public class linearMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int max = findMax(nums);
        System.out.println("Max: " + max);
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
=======

import java.util.Scanner;

public class linearMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int max = findMax(nums);
        System.out.println("Max: " + max);
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
>>>>>>> 2e8a5e38569592babaca04435a1b5fac5f2c2302
