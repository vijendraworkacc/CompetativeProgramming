package com.vs.javads.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryBufferReader {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello!");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter i: ");
		int i = Integer.parseInt(bufferedReader.readLine());
		System.out.println("i: " + i);
		System.out.print("\nEnter s: ");
		String s = bufferedReader.readLine();
		System.out.println("s: " + s);
	}
}
