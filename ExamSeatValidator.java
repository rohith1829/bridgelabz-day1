package com.bridgelabz;

public class ExamSeatValidator {
    public static void main(String[] args) {
        int[] ids = {21, 34, 43, 52};
        System.out.println(validate(ids));
    }

    static String validate(int[] ids) {
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] % 10 == ids[i + 1] % 10)
                return "Invalid - " + ids[i] + " and " + ids[i + 1] + " have same last digit";
        }
        return "Valid";
    }
}
