package com.example.parameter;

public class varArgsParameter {

	public static void m1(String name, int... i) {
		int total = 10;
		for (int y : i) {
			total = total + y;
		}
		System.out.println("Name is : " + name);
		System.out.println("Total : " + total);
	}

	public static void main(String args[]) {
		m1("My name", 1, 10, 100);
	}

}
