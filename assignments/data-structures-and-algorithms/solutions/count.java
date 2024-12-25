<<<<<<< HEAD

import java.util.*;

public class count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println(count);

    }
}
=======

import java.util.*;

public class count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println(count);

    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
