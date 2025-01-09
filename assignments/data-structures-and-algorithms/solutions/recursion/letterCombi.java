
import java.util.*;

public class letterCombi {

    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(digits, 0, "", result);
        return result;
    }

    private static void backtrack(String digits, int index, String combination, List<String> result) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            backtrack(digits, index + 1, combination + c, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
