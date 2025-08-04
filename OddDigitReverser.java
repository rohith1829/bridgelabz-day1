package com.bridgelabz;

public class OddDigitReverser {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println("Reversed Odd Digits: " + reverseOdd(num));
    }

    static int reverseOdd(int num) {
        String s = new StringBuilder(String.valueOf(num)).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (d % 2 == 1) result.append(d);
        }
        return Integer.parseInt(result.toString());
    }
}
