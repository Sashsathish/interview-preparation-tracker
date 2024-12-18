
import java.util.*;

public class swtichs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Traffic Light Simulation
        System.out.print("Enter a traffic light signal (R, Y, G): ");
        char signal = sc.next().charAt(0);
        switch (signal) {
            case 'R':
                System.out.println("Stop");
                break;
            case 'Y':
                System.out.println("Wait");
                break;
            case 'G':
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid signal.");
        }

        // Day of the Week
        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
        }

        sc.close();
    }
}
