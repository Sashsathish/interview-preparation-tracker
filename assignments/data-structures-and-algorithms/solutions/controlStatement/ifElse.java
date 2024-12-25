
import java.util.*;

public class ifElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Positive, Negative, or Zero
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number.");
        } else if (num < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        //  Odd or Even
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        //Greater of Two Numbers
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        //Divisible by 3 or 5
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by 3 and 5.");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3.");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5.");
        }

        sc.close();
    }
}
