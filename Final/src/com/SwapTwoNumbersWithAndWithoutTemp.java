package com;

public class SwapTwoNumbersWithAndWithoutTemp {

	static void swapWithTemp() {
		int a = 5, b = 6;
		System.out.println("Before swap: " + a + " & " + b);				
		int temp =a;
		a = b;
		b = temp;
		System.out.println("After swap: " + a + " & " + b + "\n");				
	}

	static void swapWithoutTemp() {
		int a = 10, b = 20;
		System.out.println("Before swap: " + a + " " + b );
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap: " + a + " " + b);
	}

	public static void main(String[] args) {
		// Swapping numbers

		System.out.println("Swapped With temp\n");

		swapWithTemp();

		System.out.println("Swapped Without temp\n");

		swapWithoutTemp();

	}

}
