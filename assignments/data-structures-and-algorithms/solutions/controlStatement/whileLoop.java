
import java.util.*;

public class whileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Count Number of Digits
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
