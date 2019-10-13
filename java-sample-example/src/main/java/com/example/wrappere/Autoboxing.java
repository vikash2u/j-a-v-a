package com.example.wrappere;

//Example of Wrapper Class in Java
public class Autoboxing {

	// Primitive to Wrapper
	public static void main(String args[]) {
		int i = 100;
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 = i; // Auto-boxing
		System.out.println(iobj + iobj1);
	}

}
