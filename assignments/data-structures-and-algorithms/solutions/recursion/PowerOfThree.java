
public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        int largestPowerOfThree = 1162261467;

        return largestPowerOfThree % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));
    }
}
