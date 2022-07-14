package com.vs.javads.basic;

public class P007_Palindrome {
	public static void main(String[] args) {
		String str = "tenet";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Original: " + str);
		System.out.println("Reverse: " + rev);
		System.out.println("Is palindrome? " + rev.equalsIgnoreCase(str));
	}
}
