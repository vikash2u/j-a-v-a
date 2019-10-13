package com.example.variable;

public class StaticVarDemo {

	static int i = 0;

	StaticVarDemo() {
		i++;
		System.out.println("Local " + i);
	}

	public static void main(String args[]) {

		StaticVarDemo d1 = new StaticVarDemo();
		d1.i = 100;
		System.out.println("D1 " + i);

		StaticVarDemo d2 = new StaticVarDemo();
		d2.i = 200;
		System.out.println("D2 " + i);

		StaticVarDemo d3 = new StaticVarDemo();
	}
}
