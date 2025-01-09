
public class fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.print(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
