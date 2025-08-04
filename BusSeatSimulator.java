package com.bridgelabz;

import java.util.*;

public class BusSeatSimulator {
    public static void main(String[] args) {
        int[] requests = {3, 5, 12, 5, 11};
        Set<Integer> booked = new HashSet<>();

        for (int seat : requests) {
            if (seat < 1 || seat > 40) {
                System.out.println("Seat " + seat + " Invalid");
            } else if (booked.contains(seat)) {
                System.out.println("Seat " + seat + " Already Booked");
            } else {
                booked.add(seat);
                System.out.println("Seat " + seat + " Booked");
            }
        }
    }
}
	