                                                                                   001


1. Leap Year

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

2. Add Two Numbers

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}

3. Print the Multiplication Table

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

4. HCF and LCM

java.util.*;
public class HL {
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int hcf = find(int num1, int num2);
     int lcm = (num1*num2)/hcf;
}
private static int find(int a, int b){
     while(b!=0)
     {
        int temp = b;
        b = a%b;
        a = temp;
     }
     return a;
  }
}















     






