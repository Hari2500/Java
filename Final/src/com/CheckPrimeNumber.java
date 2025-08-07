package com;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static boolean checkPrime(int num) {

		for (int i = 1; i < num; i++) {
			if (num % 2 == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check it is prime or not: ");
		int num = sc.nextInt();

		boolean ans = checkPrime(num);
		
		if(ans)
			System.out.println("Given number " + num + " is a prime number");
		else
			System.out.println("Given number " + num + " is not a prime number");
		
		sc.close();
	}

}
