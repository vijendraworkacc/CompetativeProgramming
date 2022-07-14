package com.vs.javads.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class P004_CountingFrequenciesOfArray {

	public static void main(String[] args) {
		System.out.println("--> Start");
		Scanner scanner = new Scanner(System.in);
		boolean alternate = true;
		int timesRepeat = scanner.nextInt();
		for (int i = 0; i < timesRepeat; i++) {
			int numOfElements = scanner.nextInt();
			int[] arr = new int[numOfElements];
			for (int j = 0; j < numOfElements; j++) {
				arr[j] = scanner.nextInt();
			}
			Map<Integer, Integer> frequencies = new HashMap<>();
			for (int j = 0; j < numOfElements; j++) {
				if (frequencies.containsKey(arr[j])) {
					frequencies.put(arr[j], frequencies.get(arr[j]) + 1);
				} else {
					frequencies.put(arr[j], 1);
				}
			}
			for (Entry<Integer, Integer> entry : frequencies.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

}
