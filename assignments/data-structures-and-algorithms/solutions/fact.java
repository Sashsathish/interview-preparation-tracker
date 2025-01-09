
public class fact {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
