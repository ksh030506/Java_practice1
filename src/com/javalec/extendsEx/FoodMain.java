package com.javalec.extendsEx;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParnetMenu b = new ParnetMenu();
		ChildMenu a = new ChildMenu();
		b.menu1();
		a.menu1();
		a.menu2();
		a.menu3();
		a.menu4();
		a.menu5();
		a.menu6();
		a.menu7();
	}

}

class ParnetMenu {
	public ParnetMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void menu1() {
		System.out.println("청국장");
	}
	public void menu2() {
		System.out.println("미역국");
	}
	public void menu3() {
		System.out.println("된장국");
	}
	public void menu4() {
		System.out.println("그냥 국");
	}
}

class ChildMenu extends ParnetMenu {
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}

	public void menu5() {
		System.out.println("돼지 고기");
	}
	public void menu6() {
		System.out.println("소고기");
	}
	public void menu7() {
		System.out.println("물");
	}

	@Override
	public void menu1() {
		System.out.println("냄새 없는 청국장");
	}
	
}