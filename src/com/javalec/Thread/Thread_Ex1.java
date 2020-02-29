package com.javalec.Thread;

public class Thread_Ex1 {
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();

		Thread thread = new Thread(threadTest, "A");
		thread.start(); // run메소드 호출

		System.out.println(Thread.currentThread().getName()); // main 현재 구동되는 쓰레드 이름 : main

	}
}  //main 스레드는 별개 이므로 main이 먼저 찍힌 것이다

class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); // 스레드의 이름을 구하는 것
		System.out.println("ThreadTest");

		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);

			try {
				Thread.sleep(500); // 스레드 0.5초 중단 시킴
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}  