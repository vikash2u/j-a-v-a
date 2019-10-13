package com.example.constructor;

public class ParameterisedConstructor {

	static int i;
	static String name;
	static float f;
	static double d;

	ParameterisedConstructor(int x, String n, float y, double z) {
		i = x;
		name = n;
		f = y;
		d = z;
	}

	public static void main(String args[]) {
		ParameterisedConstructor obj = new ParameterisedConstructor(15, "Hello world", 7.8f, 9.8);
		System.out.println("Int i :" + i);
		System.out.println("Name :" + name);
		System.out.println("Float f :" + f);
		System.out.println("Double d :" + d);
	}
}
