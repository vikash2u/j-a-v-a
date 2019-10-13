package com.example.classobjmethod;

public class ClassObjMethod {

	int fac_id;
	String fac_name;

	void display() {
		System.out.println("Faculty Id :" + fac_id);
		System.out.println("Faculty name :" + fac_name);
	}

	public static void main(String arg[]) {

		ClassObjMethod f1 = new ClassObjMethod();
		ClassObjMethod f2 = new ClassObjMethod();

		f1.fac_id = 1;
		f1.fac_name = "Faculty one";
		f2.fac_id = 2;
		f2.fac_name = "Faculty second";
		f1.display();
		f2.display();
	}
}
