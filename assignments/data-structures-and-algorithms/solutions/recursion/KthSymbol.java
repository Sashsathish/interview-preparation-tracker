
public class KthSymbol {

    public static int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int mid = 1 << (n - 2);
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        }
        return kthGrammar(n - 1, k - mid) ^ 1;
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(4, 5));
    }
}
