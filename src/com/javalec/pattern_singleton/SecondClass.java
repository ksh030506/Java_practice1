package com.javalec.pattern_singleton;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getStringletonClass();
		System.out.println("SecondClass");
		System.out.println("i = " + singletonClass.getI());
	}
}
