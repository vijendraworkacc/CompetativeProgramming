package com.vs.javads.search;

import java.util.Arrays;

public class P002_BinarySearchIterative {
	private static int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
	private static int element = 66;

	private static int binarySearchElementIteratively() {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (element == arr[mid]) {
				return mid;
			} else {
				if (element > arr[mid]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Arrays.sort(arr);
		System.out.println("Index of '" + element + "' is " + binarySearchElementIteratively());
	}

}
