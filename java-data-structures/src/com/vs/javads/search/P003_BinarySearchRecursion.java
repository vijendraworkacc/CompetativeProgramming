package com.vs.javads.search;

import java.util.Arrays;

public class P003_BinarySearchRecursion {

	private int binarySearchElementRecursively(int[] arr, int element, int left, int right) {
		int mid = (left + right) / 2;
		if (element == arr[mid]) {
			return mid;
		} else {
			if (element > arr[mid]) {
				return binarySearchElementRecursively(arr, element, mid + 1, right);
			} else {
				return binarySearchElementRecursively(arr, element, left, mid - 1);
			}
		}
	}

	public static void main(String[] args) {
		P003_BinarySearchRecursion searchRecursion = new P003_BinarySearchRecursion();
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Arrays.sort(arr);
		int element = 66;
		int left = 0;
		int right = arr.length - 1;
		System.out.println("Index of '" + element + "' is "
				+ searchRecursion.binarySearchElementRecursively(arr, element, left, right));
	}

}
