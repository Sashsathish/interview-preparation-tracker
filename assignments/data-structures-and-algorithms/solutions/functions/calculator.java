<<<<<<< HEAD

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter operation (1:+, 2:-, 3:*, 4:/, e:exit): ");
            choice = sc.next().charAt(0);
            if (choice >= '1' && choice <= '4') {
                System.out.print("Enter two numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                System.out.println("Result: " + performOperation(choice, num1, num2));
            }
        } while (choice != 'e');
        sc.close();
    }

    public static double performOperation(char operation, double num1, double num2) {
        switch (operation) {
            case '1':
                return num1 + num2;
            case '2':
                return num1 - num2;
            case '3':
                return num1 * num2;
            case '4':
                return num2 != 0 ? num1 / num2 : Double.NaN;
            default:
                return 0;
        }
    }
}
=======

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter operation (1:+, 2:-, 3:*, 4:/, e:exit): ");
            choice = sc.next().charAt(0);
            if (choice >= '1' && choice <= '4') {
                System.out.print("Enter two numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                System.out.println("Result: " + performOperation(choice, num1, num2));
            }
        } while (choice != 'e');
        sc.close();
    }

    public static double performOperation(char operation, double num1, double num2) {
        switch (operation) {
            case '1':
                return num1 + num2;
            case '2':
                return num1 - num2;
            case '3':
                return num1 * num2;
            case '4':
                return num2 != 0 ? num1 / num2 : Double.NaN;
            default:
                return 0;
        }
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
