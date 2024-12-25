
import java.util.Arrays;

public class reverse {

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Output: " + Arrays.toString(s1));

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Output: " + Arrays.toString(s2));
    }
}
