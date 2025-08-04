package com.bridgelabz;

import java.util.*;

public class TeamAssignmentGame {
    public static void main(String[] args) {
        int[] skills = {10, 20, 30, 40};
        assignTeams(skills);
    }

    static void assignTeams(int[] skills) {
        Arrays.sort(skills);
        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();
        int left = 0, right = skills.length - 1;
        while (left < right) {
            teamA.add(skills[left++]);
            teamB.add(skills[right--]);
        }
        System.out.println("Team A: " + teamA);
        System.out.println("Team B: " + teamB);
    }
}

