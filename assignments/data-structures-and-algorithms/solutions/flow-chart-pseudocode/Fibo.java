
import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1, sum;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
        scanner.close();
    }
}