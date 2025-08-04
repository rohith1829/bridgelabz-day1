package com.bridgelabz;

import java.util.Arrays;

public class AirportBoarding {
    public static int countOutOfOrder(int[] actual) {
        int[] expected = actual.clone();
        Arrays.sort(expected); 
        
        int mismatches = 0;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                mismatches++;
            }
        }
        
        
        return mismatches / 2;
    }

    public static void main(String[] args) {
        int[] actualOrder = {101, 103, 102, 104};
        System.out.println(countOutOfOrder(actualOrder)); 
    }
}
