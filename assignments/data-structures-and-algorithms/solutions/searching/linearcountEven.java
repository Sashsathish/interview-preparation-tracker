<<<<<<< HEAD

import java.util.Scanner;

public class linearcountEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int count = countEvenDigitNumbers(nums);
        System.out.println("even digits are: " + count);
    }

    public static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
=======

import java.util.Scanner;

public class linearcountEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int count = countEvenDigitNumbers(nums);
        System.out.println("even digits are: " + count);
    }

    public static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
>>>>>>> 2e8a5e38569592babaca04435a1b5fac5f2c2302
