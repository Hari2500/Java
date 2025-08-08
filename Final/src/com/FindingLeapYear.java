package com;

public class FindingLeapYear {
	
	static void leapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Lear Year");
		} else {
			System.out.println("Not a leap year");
		}
	}

	public static void main(String[] args) {
		// Finding Leap Year
		leapYear(2000);
		leapYear(2001);
	}

}
