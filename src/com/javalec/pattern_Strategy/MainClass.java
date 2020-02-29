package com.javalec.pattern_Strategy;

import com.javalec.pattern_Strategy.Inter.FlyNo;
import com.javalec.pattern_Strategy.Inter.Knife_Lazer;
import com.javalec.pattern_Strategy.Inter.MisailYes;

public class MainClass {
	public static void main(String[] args) {
      
		System.out.println("Super로봇을 만들어 주세요!!");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		
		//superRobot.setFly(new FlyNo());
		superRobot.actionFly();
		
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		
		superRobot.setKnife(new Knife_Lazer());
		superRobot.actionKnife();
		System.out.println("==================================");
	}
}
