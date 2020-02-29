package com.javalec.pattern_Strategy;

import com.javalec.pattern_Strategy.Inter.FlyYes;

public class SuperRobot extends Robot {

	public SuperRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot입니다. 외형은 팔, 다리, 몸통이 있습니다.");
	}

}
