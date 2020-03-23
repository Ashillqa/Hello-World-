package com.qa.main;

public class runner {
	
	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		
		hello.Print();
		hello.stringPrint("Hello World!");
		
		System.out.println(hello.stringReturn());
		
	}

}
