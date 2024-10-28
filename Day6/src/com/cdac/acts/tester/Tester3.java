package com.cdac.acts.tester;

import java.util.Scanner;

public class Tester3 {

	private static int multiply(int a, int b) {
		if (a == 1) return b;
		if (b == 1) return a;
		if (a == 0 || b == 0) return 0;
		else
			return a + multiply(a, b-1);
	}
	
	public static int multiplyCall(int a, int b) {
		if ((a>0 && b>0) || (a<0 && b<0)) 
			return multiply(Math.abs(a), Math.abs(b));
		else 
			return -multiply(Math.abs(a), Math.abs(b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("multiply : " + multiplyCall(a, b));
		sc.close();
	}
}

/*
 * 3. Implement following funtion to "optimally" multiple two numbers, recursively. Handle both negative and positive numbers.

 */
