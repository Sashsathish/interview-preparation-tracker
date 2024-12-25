<<<<<<< HEAD

import java.util.Scanner;

public class palindrome {

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        sc.close();
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
=======

import java.util.Scanner;

public class palindrome {

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        sc.close();
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
