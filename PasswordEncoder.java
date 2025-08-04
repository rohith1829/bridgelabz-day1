package com.bridgelabz;

public class PasswordEncoder {
    public static void main(String[] args) {
        String input = "Java1234";
        System.out.println("Encoded: " + encode(input));
    }

    static String encode(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) sb.append('@');
            else if (Character.isDigit(c) && (c - '0') % 2 == 0) sb.append('*');
            else sb.append(c);
        }
        return sb.toString().toUpperCase();
    }
}
