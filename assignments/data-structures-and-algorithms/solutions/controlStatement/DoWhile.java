<<<<<<< HEAD

import java.util.*;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Validation
        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("You entered: " + num);

        sc.close();
    }
}
=======

import java.util.*;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Validation
        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("You entered: " + num);

        sc.close();
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
