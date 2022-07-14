package com.vs.javads.basic;

public class P008_MaxMinInArray {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 45, 44, 25, 99 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
