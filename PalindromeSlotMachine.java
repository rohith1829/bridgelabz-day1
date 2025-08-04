package com.bridgelabz;

public class PalindromeSlotMachine {
    public static void main(String[] args) {
        int num = 363;
        System.out.println(isJackpot(num));
    }

    static String isJackpot(int num) {
        String s = String.valueOf(num);
        String rev = new StringBuilder(s).reverse().toString();
        int sum = 0;
        for (char c : s.toCharArray()) sum += c - '0';
        return s.equals(rev) && sum % 3 == 0 ? "Jackpot!" : "Try Again";
    }
}
