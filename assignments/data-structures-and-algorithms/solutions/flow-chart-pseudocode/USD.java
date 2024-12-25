
import java.util.Scanner;

public class USD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double rupees = scanner.nextDouble();
        double usd = rupees / 82.0;
        System.out.println(usd);
        scanner.close();
    }
}
