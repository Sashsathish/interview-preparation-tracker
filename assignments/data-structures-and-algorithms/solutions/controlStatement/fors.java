<<<<<<< HEAD

import java.util.*;

public class fors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print Numbers in Range
        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Sum of First N Numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
=======

import java.util.*;

public class fors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print Numbers in Range
        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Sum of First N Numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
