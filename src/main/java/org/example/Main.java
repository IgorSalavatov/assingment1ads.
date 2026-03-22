package org.example;

import java.util.Scanner;

public class Main {

    // Task 1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static double average(int[] arr, int n) {
        return (double) sum(arr, n) / n;
    }

    // Task 3
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }

    // Task 8
    public static boolean isDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigits(s, index + 1);
    }


    // Task 9
    public static int countChars(String s) {
        if (s.equals("")) return 0;
        return 1 + countChars(s.substring(1));
    }

    // Task 10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 1
        System.out.println("Task 1:");
        printDigits(5481);

        //Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        System.out.println(average(arr, arr.length));

        //Task 3
        System.out.println("\nTask 3:");
        int n = 7;
        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");

        //Task 4
        System.out.println("\nTask 4:");
        System.out.println(factorial(5));

        //Task 5
        System.out.println("\nTask 5:");
        System.out.println(fibonacci(5));

        //Task 6
        System.out.println("\nTask 6:");
        System.out.println(power(2, 10));

        //Task 7
        System.out.println("\nTask 7:");
        System.out.println("Enter 4 numbers:");
        reversePrint(4, sc);

        //Task 8
        System.out.println("\n\nTask 8:");
        System.out.println(isDigits("123456", 0) ? "Yes" : "No");

        //Task 9
        System.out.println("\nTask 9:");
        System.out.println(countChars("hello"));

        //Task 10
        System.out.println("\nTask 10:");
        System.out.println(gcd(32, 48));
    }
}