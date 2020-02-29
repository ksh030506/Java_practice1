package com.javalec.try_catch;

public class Test02 {
	public static void main(String[] args) {
		ThrowsExClass a = new ThrowsExClass();
	}
}


class ThrowsExClass {
	public ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception {   
		//throws 나를 호출한 곳으로 에러를 던진다 그래서 actionA에서 에러가 걸리지 않고 actioB로 넘어가서 try구문을 실행한다
		System.out.println("acionA");
		
		int[] iArr = {1, 2, 3, 4};
		System.out.println(iArr[4]);
		
		System.out.println("actionAA");
	}
	
	private void actionB() {
		// TODO Auto-generated method stub
		System.out.println("actionB");
		
		try {
			actionA();
		} catch (Exception e) {
			System.out.println("예외는 actionB에서 처리 할께요^^");
			System.out.println(e.getMessage());
		}
		
		System.out.println("actionBB");
	}
	
	private void actionC() {
		// TODO Auto-generated method stub
		System.out.println("actionC");
		
		actionB();
		System.out.println("actionCC");
	}
}