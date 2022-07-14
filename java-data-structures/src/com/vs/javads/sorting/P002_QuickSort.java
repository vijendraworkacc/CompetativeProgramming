package com.vs.javads.sorting;

/* 
 * https://www.youtube.com/watch?v=7h1s2SojIRw 
 */
public class P002_QuickSort {

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private int partition(int[] arr, int left, int right) {
		/* Keeping the right most element as pivot. */
		int pivot = arr[right];

		/*
		 * Variable i points to the index which holds the smallest element. Initially it
		 * will not point to any index of an array.
		 */
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] < pivot) {
				/* Incrementing i because we found a new small element than the pivot. */
				i++;

				/* Swapping the positions of pivot and the small element found. */
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	private void sort(int[] arr, int left, int right) {
		if (left < right) {
			int partitionIndex = partition(arr, left, right);
			sort(arr, left, partitionIndex - 1);
			sort(arr, partitionIndex + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		int left = 0;
		int right = arr.length - 1;
		P002_QuickSort quickSort = new P002_QuickSort();
		quickSort.sort(arr, left, right);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
