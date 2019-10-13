package com.example.methodoverloading;

//Same name but different signature

public class overloadingdemo {
	
	void sum_m1(int i)
	{
		System.out.println(i);
	}
	void sum_m1(int i, int j)
	{
		System.out.println(i+j);
	}
	
	void sum_m1(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public static void main(String args[]) {
		overloadingdemo obj = new overloadingdemo();
		obj.sum_m1(10);
		obj.sum_m1(10,10);
		obj.sum_m1(10,10,10);

	}
}
