package com.bridgelabz;

import java.util.Scanner;

public class VowelPuzzleChecker {
public static void main(String[] args) {
	int endCount=0,middleCount=0;
	System.out.println("Enter string:");
	String input=new Scanner(System.in).nextLine();
	input=input.toLowerCase();
	for(int i=0;i<input.length();i++) {
		if("aeiou".indexOf(input.charAt(i))!=-1) {
			
		if(i==0||i==input.length()-1)
			endCount++;
		else
			middleCount++;
		}
		
	}
	if(endCount==2 && middleCount==2)
		System.out.println("Valid");
	else
		System.out.println("Invalid");
}
}
