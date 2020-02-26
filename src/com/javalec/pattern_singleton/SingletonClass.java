package com.javalec.pattern_singleton;

public class SingletonClass {
	
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}  //접근을 해서 객체를 생성해야되는데 private이기 때문에 외부에서 만들수 없음 ( 내부에서만 생성 가능 )
	
	
	public static SingletonClass getStringletonClass() {
		
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
		
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
}
