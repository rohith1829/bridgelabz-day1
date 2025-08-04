package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class RankListGenerator {
    public static void main(String[] args) {
        int[] marks = {50, 80, 60};
        generateRanks(marks);
    }

    static void generateRanks(int[] marks) {
        Integer[] m = Arrays.stream(marks).boxed().toArray(Integer[]::new);
        Arrays.sort(m, Collections.reverseOrder());
        for (int i = 0; i < m.length; i++)
            System.out.println((i + 1) + ". " + m[i]);
    }
}

