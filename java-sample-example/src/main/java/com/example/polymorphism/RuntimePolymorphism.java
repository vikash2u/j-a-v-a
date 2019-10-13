package com.example.polymorphism;

public class RuntimePolymorphism {

	class runtime1 {
		void m1() {
			System.out.println("Child Class");
		}

	}

	class runtime2 extends runtime1 {
		void m1() {
			System.out.println("Parent Class");
		}
	}

	private Object runtime1;

	public static void main(String args[]) {
	//	RuntimePolymorphism obj = new RuntimePolymorphism();
	//	((runtime1) obj.runtime1).m1();
		
		
	}

}
