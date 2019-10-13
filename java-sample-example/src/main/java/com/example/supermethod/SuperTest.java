package com.example.supermethod;

class super1 {
	super1() {
		System.out.println("Super 1 Class Constructor");
	}
}

class child2 extends super1 {
	child2() {
		super();
	}
}

public class SuperTest {
	public static void main(String args[]) {
		child2 obj = new child2();

	}
}
