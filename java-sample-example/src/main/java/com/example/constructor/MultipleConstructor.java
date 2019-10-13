package com.example.constructor;

public class MultipleConstructor {

	//Define static and not static to see thedifference
	int i;
	String name;
	float f;
	double d;

	MultipleConstructor(int x, String n, float y, double z) {
		i = x;
		name = n;
		f = y;
		d = z;
	}

	MultipleConstructor() {
		i = 50;
		name = "Hello World";
		f = 5.6f;
		d = 7.8;
	}

	public static void main(String args[]) {
		MultipleConstructor obj = new MultipleConstructor(15, "Hello world", 7.8f, 9.8);
		MultipleConstructor objdefault = new MultipleConstructor();

		System.out.println("Int i :" + objdefault.i);
		System.out.println("Name :" + objdefault.name);
		System.out.println("Float f :" + objdefault.f);
		System.out.println("Double d :" + objdefault.d);

		System.out.println("Int i :" + obj.i);
		System.out.println("Name :" + obj.name);
		System.out.println("Float f :" + obj.f);
		System.out.println("Double d :" + obj.d);
	}
}
