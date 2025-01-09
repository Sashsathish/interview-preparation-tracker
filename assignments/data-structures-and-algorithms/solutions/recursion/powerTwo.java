
import java.util.Scanner;

public class powerTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            boolean result = isPowerOfTwo(n);
            System.out.println("Is " + n + " a power of two? " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
