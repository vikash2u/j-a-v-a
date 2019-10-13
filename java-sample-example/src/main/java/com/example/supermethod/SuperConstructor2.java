package com.example.supermethod;

class baseConstructor {
	int i = 10;

	void m1() {
		System.out.println("Super Class Constructor");
	}
}

class childConstructor extends baseConstructor {
	int i = 20;

	void m1() {
		System.out.println("Value of i :" + i);
		System.out.println("Value of Super i :" + super.i);

	}
}

public class SuperConstructor2 {
	public static void main(String args[]) {
		childConstructor obj = new childConstructor();
		obj.m1();
	}
}
