package com.vs.javads.basic;

public class P006_NumberDigitsSum {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			num /= 10;
			sum += rem;
		}
		System.out.println("Sum: " + sum);
	}
}
