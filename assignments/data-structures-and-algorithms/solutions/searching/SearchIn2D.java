
import java.util.Scanner;

public class SearchIn2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int col = scanner.nextInt();

        int[][] matrix = new int[rows][col];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("target:");
        int target = scanner.nextInt();

        boolean found = search2D(matrix, target);
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public static boolean search2D(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
