package com.example.constructor;

public class MethodAndConstructor {

	int i;
	String name;
	float f;
	double d;

	MethodAndConstructor() {
		i = 10;
		name = "Hello World";
		f = 4.5f;
		d = 6.8;
	}

	void MethodAndConstructor() {
		System.out.println("Hello Method");
	}

	public static void main(String args[]) {
		MethodAndConstructor obj = new MethodAndConstructor();
		System.out.println("Int i :" + obj.i);
		System.out.println("Name :" + obj.name);
		System.out.println("Float f :" + obj.f);
		System.out.println("Double d :" + obj.d);
		obj.MethodAndConstructor();

	}
}
