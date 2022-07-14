package com.vs.javads.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Time Complexity : O(n)
 * 
 * Using while loop.
 */
public class P001_ReverseAnArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("--> Start: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int elements = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[elements];
		for (int i = 0; i < elements; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		System.out.print("Input: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			// Not -> start != end
			// Not -> start <= end
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("\nOutput: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
