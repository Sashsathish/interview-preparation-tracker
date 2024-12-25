<<<<<<< HEAD

import java.util.*;

public class prime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if (n == 1) {
            System.out.println("1 is not a prime");
        }

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " not prime");
                break;
            }

        }
        if (i == n) {
            System.out.println(n + " is prime");
        }
    }
}
=======

import java.util.*;

public class prime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if (n == 1) {
            System.out.println("1 is not a prime");
        }

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " not prime");
                break;
            }

        }
        if (i == n) {
            System.out.println(n + " is prime");
        }
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
