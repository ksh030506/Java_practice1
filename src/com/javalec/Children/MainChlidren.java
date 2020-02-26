package com.javalec.Children;

public class MainChlidren {
	public static void main(String[] args) {
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("child1의 식대 가격 : " + child1.calculating());
		System.out.println("child2의 식대 가격 : " + child2.calculating());
	}
}


class PriceTable {    //고유 가격 클래스
	public static final int RICE = 1000;
	public static final int BULGOGI = 2000;
	public static final int BANANA = 700;
	public static final int MILK = 200;
	public static final int ALMOND = 100;
}


abstract class LunchMenu {
	public int rice;
	public int bulgogi;
	
	public int banana;
	public int milk;
	public int almond;
	
	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		// TODO Auto-generated constructor stub
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	
	public abstract int calculating();
}



class Child1 extends LunchMenu{
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almon) {
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, almon);
	}

	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}
}




class Child2 extends LunchMenu{
	public Child2(int rice, int bulgogi, int banana, int milk, int almon) {
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, almon);
	}

	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice + bulgogi + milk + almond;
	}
}