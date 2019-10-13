package com.example.constructor;

public class DefaultConstructor {

	static int i;
	static String name;
	static float f;
	static double d;

	public static void main(String args[]) {
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println("Int i :" + i);
		System.out.println("Name :" + name);
		System.out.println("Float f :" + f);
		System.out.println("Double d :" + d);
	}
}
