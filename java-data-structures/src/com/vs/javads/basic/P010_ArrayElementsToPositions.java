package com.vs.javads.basic;

import java.util.Arrays;
import java.util.HashMap;

public class P010_ArrayElementsToPositions {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 20, 7 };
		int[] tempArr = arr.clone();
		Arrays.sort(tempArr);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < tempArr.length; i++) {
			hashMap.put(tempArr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = hashMap.get(arr[i]);
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
