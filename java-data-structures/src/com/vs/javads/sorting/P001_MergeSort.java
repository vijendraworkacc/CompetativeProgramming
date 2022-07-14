package com.vs.javads.sorting;

import java.util.Iterator;

public class P001_MergeSort {

	private void sort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	/*
	 * This method merges two sub array, which are array[left... mid] and array[(mid
	 * + 1)... right].
	 */
	private void merge(int[] arr, int left, int mid, int right) {
		/*
		 * Finding the size of the sub-arrays to be merged.
		 */
		int leftSize = mid - left + 1;
		int rightSize = right - mid;
		int[] leftTemp = new int[leftSize];
		int[] rightTemp = new int[rightSize];
		/*
		 * Copying the data in the temp arrays. For left sub-array data should be copied
		 * from left to mid. For right sub-array data should be copied from (mid + 1) to
		 * right.
		 */
		for (int i = 0; i < leftTemp.length; i++) {
			leftTemp[i] = arr[left + i];
		}
		for (int i = 0; i < rightTemp.length; i++) {
			rightTemp[i] = arr[mid + 1 + i];
		}
		/*
		 * Merge the two temp arrays, i and j are initialized to the first index on temp
		 * array. And k is initialized to the initial index of the merged sub-array.
		 */
		int i = 0, j = 0;
		int k = left;
		while (i < leftSize && j < rightSize) {
			if (leftTemp[i] < rightTemp[j]) {
				arr[k] = leftTemp[i];
				i++;
			} else {
				arr[k] = rightTemp[j];
				j++;
			}
			k++;
		}
		/*
		 * Copying the remaining elements of an array if any.
		 */
		while (i < leftSize) {
			arr[k] = leftTemp[i];
			k++;
			i++;
		}
		while (j < rightSize) {
			arr[k] = rightTemp[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		int left = 0;
		int right = arr.length - 1;
		P001_MergeSort mergeSort = new P001_MergeSort();
		mergeSort.sort(arr, left, right);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
