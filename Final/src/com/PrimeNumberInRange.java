package com;

public class PrimeNumberInRange {
	
	static boolean isPrime(int n) {
		
		if(n<2)
			return false;
		
		for(int i=2; i<n;i++) {
			if(n%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int start = 1, end = 10;
		
		for (int i = start; i <= end; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}

}
