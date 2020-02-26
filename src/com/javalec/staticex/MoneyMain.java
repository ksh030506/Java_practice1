package com.javalec.staticex;

public class MoneyMain {
	public static void main(String[] args) {
		FirstChild f = new FirstChild();
		f.takeMoney(100);
		
		SecondChild s = new SecondChild();
		s.takeMoney(100);
		
		ThirdChild t = new ThirdChild();
		t.takeMoney(100);
		
		System.out.println("아빠 남은돈 " + PapaPouch.MONEY);
	}
}


class PapaPouch {
	public static int MONEY = 200;
	
	public PapaPouch() {
		// TODO Auto-generated constructor stub
	}
}

class FirstChild {
	public FirstChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY = PapaPouch.MONEY - money;   //바로 접근이 가능하다!
		if(PapaPouch.MONEY < 0) System.out.println("첫째는 돈이 없어 못 받았어요 ㅠ");
	}
}

class SecondChild {
	public SecondChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY = PapaPouch.MONEY - money;   //바로 접근이 가능하다!
		if(PapaPouch.MONEY < 0) System.out.println("둘째는 돈이 없어 못 받았어요 ㅠ");
	}
}

class ThirdChild {
	public ThirdChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY = PapaPouch.MONEY - money;   //바로 접근이 가능하다!
		if(PapaPouch.MONEY < 0) System.out.println("셋째는 돈이 없어 못 받았어요 ㅠ");
	}
}