
public class recursion {

    public static void main(String[] args) {
        int n;
        prints(5);

    }

    public static void prints(int n) {
        if (n == 0) {
            return;
        }

        prints(n - 1);
        System.out.println(n);
    }
}
