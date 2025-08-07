package com;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(int num) {
		int ori = num;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num /= 10;
		}
		if(rev == ori)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check it is palindrome or not: ");
		int num = sc.nextInt();
		boolean res =checkPalindrome(num);
		
		if(res)
			System.out.println("The given number " + num + " is palindrome.");
		else
			System.out.println("The given number " + num + " is not a palindrome.");
		
		sc.close();
	}

}
