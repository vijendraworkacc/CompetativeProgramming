package com.vs.javads.basic;

public class P005_KadaneAlgorithm {
	public static int findMaxSumSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		for (int i = 0; i < arr.length; i++) {
			current += arr[i];
			if (max < current) {
				max = current;
			}
			if (current < 0) {
				current = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Max sum: " + findMaxSumSubArray(arr));
	}
}
