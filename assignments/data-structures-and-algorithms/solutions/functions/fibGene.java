<<<<<<< HEAD

import java.util.Scanner;

public class fibGene {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();
        generateFibonacci(n);
        sc.close();
    }
}
=======

import java.util.Scanner;

public class fibGene {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();
        generateFibonacci(n);
        sc.close();
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
