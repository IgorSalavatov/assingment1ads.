package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1:");
        RecursionTasks.printDigits(5481);

        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        System.out.println(RecursionTasks.average(arr, arr.length));

        System.out.println("\nTask 3:");
        System.out.println(RecursionTasks.isPrime(7, 2) ? "Prime" : "Composite");

        System.out.println("\nTask 4:");
        System.out.println(RecursionTasks.factorial(5));

        System.out.println("\nTask 5:");
        System.out.println(RecursionTasks.fibonacci(5));

        System.out.println("\nTask 6:");
        System.out.println(RecursionTasks.power(2, 10));

        System.out.println("\nTask 7:");
        System.out.println("Enter 4 numbers:");
        RecursionTasks.reversePrint(4, sc);

        System.out.println("\n\nTask 8:");
        System.out.println(RecursionTasks.isDigits("123456", 0) ? "Yes" : "No");

        System.out.println("\nTask 9:");
        System.out.println(RecursionTasks.countChars("hello"));

        System.out.println("\nTask 10:");
        System.out.println(RecursionTasks.gcd(32, 48));
    }
}