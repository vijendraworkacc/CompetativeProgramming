package com.vs.javads.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Time Complexity : O(n)
 * 
 * Using recursion.
 */
public class P002_ReverseAnArray {

	public static void reverse(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		reverse(arr, start, end);
	}

	public static void main(String[] args) {
		// System.out.println("--> Start");
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			int elements = scanner.nextInt();
			int[] arr = new int[elements];
			for (int i = 0; i < elements; i++) {
				arr[i] = scanner.nextInt();
			}
			reverse(arr, 0, arr.length - 1);
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
