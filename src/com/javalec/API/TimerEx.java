package com.javalec.API;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	
	public TimerEx() throws InterruptedException{
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		Timer timer = new Timer(true);
		TimerTask t1 = new ExTimer();
		TimerTask t2 = new ExTimer1();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 10000);
		
		Thread.sleep(11000);   //잠시 기다려 준다
		System.out.println("**");
	}
}

class ExTimer extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("2초 뒤에 이곳의 작업이 실행됩니다");
	}
	
}


class ExTimer1 extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("10초 후에 이곳의 작업이 실행됩니다");
	}
	
}