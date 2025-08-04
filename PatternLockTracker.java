package com.bridgelabz;
import java.util.Scanner;

public class PatternLockTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int correct = 1234;
        int attempts = 0;
        while (attempts < 5) {
            System.out.print("Enter pattern: ");
            int input = sc.nextInt();
            if (input == correct) {
                System.out.println("Success");
                return;
            }
            attempts++;
        }
        System.out.println("System Locked");
    }
}
