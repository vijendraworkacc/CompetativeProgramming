package com.vs.javads.basic;

import java.util.Scanner;

/*
 * Reena had been given an array arr[] of positive integers of size N.
 * Help her to find the value A. 
 * A = arr[n]*arr[n] - arr[n-1]*arr[n-1] + arr[n-2]*arr[n-2] - ......... upto index 1 
 */
public class P003_ReverseSquaredSum {
	public static void main(String[] args) {
		System.out.println("--> Start");
		Scanner scanner = new Scanner(System.in);
		boolean alternate = true;
		int timesRepeat = scanner.nextInt();
		for (int i = 0; i < timesRepeat; i++) {
			int numOfElements = scanner.nextInt();
			int sum = 0;
			int[] arr = new int[numOfElements];
			for (int j = 0; j < numOfElements; j++) {
				arr[j] = scanner.nextInt();
			}
			for (int j = numOfElements - 1; j >= 0; j = j - 2) {
				if (numOfElements % 2 == 0) {
					sum += (arr[j] * arr[j] - arr[j - 1] * arr[j - 1]);
				} else {
					if (j != 0) {
						sum += (arr[j] * arr[j] - arr[j - 1] * arr[j - 1]);
					} else {
						sum += arr[j] * arr[j];
					}
				}
			}
			System.out.println(sum);
		}
	}
}
