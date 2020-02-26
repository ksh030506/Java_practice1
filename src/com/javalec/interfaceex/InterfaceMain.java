package com.javalec.interfaceex;

public class InterfaceMain {
	public static void main(String[] args) {
		InterfaceClass inter = new InterfaceClass();
		
		inter.getStr();
		inter.calculate();
		
		
	interfa1 in = new InterfaceClass();
	in.calculate();
	
	interfa2 in2 = new InterfaceClass();
	in2.getStr();  //타입 여러가지로 바꿔서 쓴다
	}
}


interface interfa1 {
	public static int CONSTSNT_NUM = 1000;
	
	public void calculate();
}

interface interfa2 {
	public static final String CONSTSNT_STEING = "hello";
	
	public String getStr();
}


class InterfaceClass implements interfa1, interfa2{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제 구현 메소드");
	}

	@Override
	public String getStr() {
		System.out.println("실제 구현은 여기서 합니다.!");
		return null;
	}
}