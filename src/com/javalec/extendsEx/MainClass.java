package com.javalec.extendsEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass a = new ChildClass();
		a.getPapaName();
		a.getMamiName();

		System.out.println(a.pStr);
		System.out.println(a.cStr);
	}

}

class ParentClass {
	public String pStr = "부모 클래스";

	public ParentClass() {
		// TODO Auto-generated constructor stub
	}

	public String getPapaName() {
		System.out.println("홍길동");
		return "";
	}

	public String getMamiName() {
		System.out.println("홍길순");
		return "";
	}
}

class ChildClass extends ParentClass {
	public String cStr = "자식 클래스";

	public ChildClass() {
		// TODO Auto-generated constructor stub
	}
}