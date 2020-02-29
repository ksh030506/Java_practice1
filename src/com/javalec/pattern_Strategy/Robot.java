package com.javalec.pattern_Strategy;

import com.javalec.pattern_Strategy.Inter.IFly;
import com.javalec.pattern_Strategy.Inter.IKnife;
import com.javalec.pattern_Strategy.Inter.IMisail;

public abstract class Robot {

	IFly fly;
	IMisail misail;
	IKnife knife;

	public Robot() {}

	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}

	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}

	public abstract void shape();

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMisail(IMisail misail) {
		this.misail = misail;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	} // 중요!!!!
	
	
	
	public void actionFly() {
		this.fly.fly(); // 각 객체가 가지고 있는 (오버라이드된) 메소드들이 실행된다
	}

	public void actionMisail() {
		this.misail.Misail(); // 각 객체가 가지고 있는 (오버라이드된) 메소드들이 실행된다
	}

	public void actionKnife() {
		this.knife.Knife(); // 각 객체가 가지고 있는 (오버라이드된) 메소드들이 실행된다
	}
}
