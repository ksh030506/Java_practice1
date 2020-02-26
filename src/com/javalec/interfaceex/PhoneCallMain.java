package com.javalec.interfaceex;

public class PhoneCallMain {
	public static void main(String[] args) {
//		PhoneA a = new PhoneA();
//		PhoneB b = new PhoneB();
		
		IFunction a = new PhoneA();
		IFunction b = new PhoneB();
		
		
		IFunction[] iFus = {a, b};   //다형성 IF이라는 데이터 타입으로 통일
		
		for(int i = 0; i < iFus.length; i++) {
			iFus[i].callSenderReceive();
			iFus[i].canLete();
			iFus[i].tvRemoteController();
			System.out.println("========================================");
		}
		
		
	}
}

interface IFunction {
	void callSenderReceive();
	void canLete();
	void tvRemoteController();
}


class PhoneA implements IFunction{

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능");
		
	}

	@Override
	public void canLete() {
		// TODO Auto-generated method stub
		System.out.println("불가능 36입니다!");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("미탑제");
	}
	
}


class PhoneB implements IFunction{

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("불가능");
		
	}

	@Override
	public void canLete() {
		// TODO Auto-generated method stub
		System.out.println("가능 1000입니다!");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("탑제");
	}
	
}