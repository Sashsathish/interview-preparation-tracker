
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combi {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target < 0) {
            return; // No valid combination
        }
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose the candidate
            backtrack(candidates, target - candidates[i], i, current, result); // Explore further
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of candidates:");
        int n = scanner.nextInt();
        int[] candidates = new int[n];
        System.out.println("Enter the candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }
        System.out.println("Enter the target:");
        int target = scanner.nextInt();

        List<List<Integer>> combinations = combinationSum(candidates, target);
        System.out.println("Unique combinations that sum to the target:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
