package com.example.wrappere;

//Example of Wrapper Class in Java
public class Unboxing {

	// Wrapper to Primitive
	public static void main(String args[]) {
		Integer iobj = new Integer(100);
		int i = iobj.intValue();
		int j = iobj; // Unboxing
		System.out.println(i + j);
	}
}
