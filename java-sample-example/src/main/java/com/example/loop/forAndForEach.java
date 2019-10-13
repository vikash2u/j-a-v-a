package com.example.loop;

public class forAndForEach {

	public static void main(String args[]) {
		int[] ar = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Normal for loop");
			System.out.println(ar[2]);
		}
		for (int x : ar) {
			System.out.println("New For Each loop");
			System.out.println(x);
		}
	}
}
