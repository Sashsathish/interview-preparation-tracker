
import java.util.*;

public class NIncrease {

    public static List<String> findNumbers(int n) {
        List<String> result = new ArrayList<>();
        generate("", 1, n, result);
        return result;
    }

    private static void generate(String current, int start, int n, List<String> result) {
        if (n == 0) {
            result.add(current);
            return;
        }
        for (int i = start; i <= 9; i++) {
            generate(current + i, i + 1, n - 1, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(2)); // Example usage
    }
}
