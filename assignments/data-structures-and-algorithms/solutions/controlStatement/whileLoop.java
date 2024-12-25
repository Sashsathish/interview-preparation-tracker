<<<<<<< HEAD

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
=======

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
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
