package com.javalec.abstractex;


public class MainClass {
	public static void main(String[] args) {
		StoerNum1 a = new StoerNum1();
		a.order1();
		a.order5();
	}
}

abstract class HeadQuarterStore {
	public HeadQuarterStore() {
		// TODO Auto-generated constructor stub
	}
	public abstract void order1();
	public abstract void order2();
	public abstract void order3();
	public abstract void order4();
	public abstract void order5();
}

class StoerNum1 extends HeadQuarterStore{
	public StoerNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void order1() {
		// TODO Auto-generated method stub
		System.out.println("4500원 입니다");
	}
	@Override
	public void order2() {
		// TODO Auto-generated method stub
		System.out.println("5000원 입니다.");
	}
	
	@Override
	public void order3() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않습니다");
	}

	@Override
	public void order4() {
		System.out.println("6000");
		
	}

	@Override
	public void order5() {
		System.out.println("7000");
		
	}
}