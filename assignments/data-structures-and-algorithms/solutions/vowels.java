<<<<<<< HEAD

import java.util.*;

public class vowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        switch (Character.toLowerCase(a)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:

                if (Character.isLetter(a)) {
                    System.out.println("Constant");
                } else {
                    System.out.println("Special Character");
                }
        }
    }
}
=======

import java.util.*;

public class vowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        switch (Character.toLowerCase(a)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:

                if (Character.isLetter(a)) {
                    System.out.println("Constant");
                } else {
                    System.out.println("Special Character");
                }
        }
    }
}
>>>>>>> 015e51f89d1ac194bbb7f634365f4faf752e0a85
