package com.cdac.acts.tester;

import java.util.Scanner;

public class Tester {
	
	private static int quotient(int a, int b) {
		if (a == 0) return 0;
		if (b == 1) return a;
		if (b == 0) return -1;
		if (a < b) return 0;
		else
		return 1 + quotient(a - b, b);
	}
	
	public static int quotientCall(int a, int b) {
		
		if ((a>0 && b>0) || (a<0 && b<0)) {
			return quotient(Math.abs(a), Math.abs(b));
		}
		else 
			return -quotient(Math.abs(a), Math.abs(b));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Quotient : " + quotientCall(a, b));
		sc.close();
	}
}

/*
1. Write recursive algorithm to find quotient after dividing two numbers.
   Using above definition, implement following function to return quotient after dividing two numbers (a / b). int quotient(int a, int b);
   Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
 */