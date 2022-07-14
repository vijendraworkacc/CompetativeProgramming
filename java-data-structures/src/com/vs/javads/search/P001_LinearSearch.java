package com.vs.javads.search;

public class P001_LinearSearch {
	private static int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
	private static int element = 66;

	private static int searchElement() {
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Index of '" + element + "' is " + searchElement());
	}

}
