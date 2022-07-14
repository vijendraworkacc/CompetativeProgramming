package com.vs.javads.basic;

public class P009_PrefixSumArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 5, 15 };
		int[] sumArr = new int[arr.length];
		sumArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i];
		}
		System.out.println("Original: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nSum array: ");
		for (int i : sumArr) {
			System.out.print(i + " ");
		}
	}
}
