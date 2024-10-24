package com.cdac.acts.tester;

import java.util.Scanner;

public class Tester2 {

	private static int remainder(int a, int b) {
		if (a < b) return a;
		else
			return remainder(a - b, b);
	}

	public static int remainderCall(int a, int b) {
		if (a<0 && b > 0) return -remainder(Math.abs(a), Math.abs(b));
		return remainder(Math.abs(a), Math.abs(b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("remainder : " + remainderCall(a, b));
		sc.close();
	}

}
/*
2. Write recursive algorithm to find remainder after dividing two numbers.
Using above definition, implement following function to return remainder after dividing two numbers (a % b). int remainder(int a, int b);
Follow up: Modify implementation/Implement wrapper function to handle both positive and negative numbers.
 */