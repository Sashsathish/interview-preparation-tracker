
import java.util.*;

public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements:");
        int c = sc.nextInt();
        System.out.println("enter the elements of a :");
        int a = sc.nextInt();

        int[][] num = new int[c][a];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("enter the nums[" + i + "]" + "[" + j + "]");
                num[i][j] = sc.nextInt();
            }
        }
        for (int[] b : num) {
            System.out.println(Arrays.toString(b));
        }
    }
}
