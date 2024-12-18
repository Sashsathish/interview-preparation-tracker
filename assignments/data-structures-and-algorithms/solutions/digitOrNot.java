
import java.util.*;

public class digitOrNot {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char character = sc.next().charAt(0);
        if (character >= '0' && character <= '9') {
            System.out.println("This is a digit.");
        }
    }
}
