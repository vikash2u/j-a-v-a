package com.example.supermethod;

class base {
	
	base() {
		System.out.println("Base Class Constructor");
	}
}

class child extends base {
	child() {
		System.out.println("Child Class Constructor without super");
	}
}

public class SuperConstructor {
	public static void main(String args[]) {
		child obj = new child();
	}
}
