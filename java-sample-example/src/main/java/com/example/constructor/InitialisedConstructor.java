package com.example.constructor;

public class InitialisedConstructor {

	static int i;
	static String name;
	static float f;
	static double d;

	InitialisedConstructor() {
		i = 10;
		name = "Hello World";
		f = 4.5f;
		d = 6.8;
	}

	public static void main(String args[]) {
		InitialisedConstructor obj = new InitialisedConstructor();
		System.out.println("Int i :" + i);
		System.out.println("Name :" + name);
		System.out.println("Float f :" + f);
		System.out.println("Double d :" + d);
	}
}
