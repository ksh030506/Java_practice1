package com.javalec.superex;

public class MainClass {
	public static void main(String[] args) {
		ChildClass a = new ChildClass();
		a.method();    
	}
}




class ParentClass {
	public ParentClass() {
		System.out.println("부모 클래스 생성자 생성됨");
	}
	
	public void method() {
		System.out.println("부모 클래스의 메소드 method입니다.");
	}
}

class ChildClass extends ParentClass{
	public ChildClass() {
		System.out.println("자식 클래스 생성자 생성됨");
		super.method();
		this.method();
	}
	
	@Override
	public void method() {
		super.method();
		
		System.out.println("부모 클래스를 실행하고 자식클래스 입니다.!!");
	}
}
