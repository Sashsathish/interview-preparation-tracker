
import java.util.*;

public class sumuntilX {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {

            String input = sc.next();

            if (input.equalsIgnoreCase("X")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;

        }

        System.out.println("The total sum is: " + sum);
        sc.close();
    }
}
