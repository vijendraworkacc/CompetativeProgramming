package com.vs.javads.basic;

public class P014_MaximumSumOfKConsecutiveElements {
	private static int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
	private static int k = 4;
	private static int maxSum = 0;

	public static int findMaximumSumOfKConsecutiveElements() {
		int currentSum = 0;
		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}
		currentSum = maxSum;
		for (int i = k; i < arr.length; i++) {
			currentSum += (arr[i] - arr[i - k]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println("Maximum sum is: " + findMaximumSumOfKConsecutiveElements());
	}
}
