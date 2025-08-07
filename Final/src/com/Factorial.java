package com;

import java.util.Scanner;

public class Factorial {
	
	public static long palindromeOrNot(int num) {
		long res = 1;
		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers");
		} else {
			for (int i = 1; i <= num; i++) {
				res = res * i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter non-negative number to find factorial: ");
		int num = sc.nextInt();
		long res = palindromeOrNot(num);
		System.out.println("The factorial for the given number " + num + " is: " + res);
		sc.close();
		
	}

}
