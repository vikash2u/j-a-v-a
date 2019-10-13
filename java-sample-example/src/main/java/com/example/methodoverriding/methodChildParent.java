package com.example.methodoverriding;

class parent1 {
	void m1() {
		System.out.println("M1 method of Parent Class");
	}
}

class child1 extends parent1 {
	/*
	 * void m1() { System.out.println("M1 method of Child Class"); }
	 */
}

public class methodChildParent {

	public static void main(String args[]) {
		child1 obj1 = new child1();
		obj1.m1();
	}

}
