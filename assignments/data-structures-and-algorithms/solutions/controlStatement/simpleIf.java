
import java.util.*;

public class simpleIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Check Positive Number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");
        }

        //  Even or Odd 
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        }

        //  Divisible by 5
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        }

        //  Uppercase Check
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("The character is uppercase.");
        }

        //  Voting Eligibility
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        //  Temperature Check
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();
        if (temp > 30) {
            System.out.println("It's hot outside.");
        }

        // Vowel Check
        System.out.print("Enter a character: ");
        ch = sc.next().toLowerCase().charAt(0);
        if ("aeiou".indexOf(ch) != -1) {
            System.out.println("The character is a vowel.");
        }

        //  Low Balance Warning
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        if (balance < 100) {
            System.out.println("Warning: Low balance.");
        }

        // Discount Eligibility
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        if (amount > 500) {
            System.out.println("You are eligible for a discount.");
        }

        // Character is Digit
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("This is a digit.");
        }

        sc.close();
    }
}
