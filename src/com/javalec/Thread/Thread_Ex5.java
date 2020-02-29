package com.javalec.Thread;

import java.util.Random;

//선거 개표 방송에서 지역1, 지역2, 지역3의 개표율을 Thread를 통해 만들었다

public class Thread_Ex5 {
	public static void main(String[] args) {
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread location1 = new Thread(voteLocation1, "Locaion1");
		Thread location2 = new Thread(voteLocation2, "Locaion2");
		Thread location3 = new Thread(voteLocation3, "Locaion3");
		
		location1.start();
		location2.start();
		location3.start();
	}
}


class VoteThread implements Runnable{
	
	int targetNum = 100;   //개표율
	int sum = 0;
	Random random = new Random();  //개표하는 진행하는 속도

	@Override
	public void run() {
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			sum += random.nextInt(10);
			sb.delete(0, sb.toString().length());
			
			if(sum >= targetNum) {
				sum = 100;
				for(int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 의 개표율 : " + sum + "\t" + sb);
				break;
			} else {
				for(int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 의 개표율 : " + sum + "\t" + sb);
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}