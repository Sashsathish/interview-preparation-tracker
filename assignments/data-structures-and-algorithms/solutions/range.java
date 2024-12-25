
import java.util.*;

public class range {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        if (n > a) {
            System.out.println("Invalid");
        }

        for (int i = n; i < a; i++) {
            System.out.println(i);
        }
    }
}
