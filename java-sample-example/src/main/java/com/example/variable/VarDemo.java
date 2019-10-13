package com.example.variable;

public class VarDemo {

	int i = 0;

	VarDemo() {
		i++;
		System.out.println(i);
	}

	public static void main(String args[]) {

		new VarDemo();
		new VarDemo();
		new VarDemo();
		new VarDemo();
		new VarDemo();

	}
}
