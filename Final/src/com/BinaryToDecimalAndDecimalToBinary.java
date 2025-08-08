package com;

public class BinaryToDecimalAndDecimalToBinary {
	
	static void b2d() {
		 String binaryString = "10110"; // Example binary string
	        int decimalNumber = Integer.parseInt(binaryString, 2);
	        System.out.println("Binary: " + binaryString + " -> Decimal: " + decimalNumber);
	}
	static void d2b() {
		int decimalNumber = 22; // Example decimal number
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal: " + decimalNumber + " -> Binary: " + binaryString);
	}

	public static void main(String[] args) {
		// Binary to decimal decimal to binary
		b2d();
		d2b();
	}

}
