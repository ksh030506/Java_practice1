package com.javalec.Thread;


//객체 1개 스레드 1개
public class Thread_Ex4 {
	public static void main(String[] args) {
		ThreadTest3 thradTest0 = new ThreadTest3();
		ThreadTest3 thradTest1 = new ThreadTest3();
		
		Thread thread0 = new Thread(thradTest0, "A");
		Thread thread1 = new Thread(thradTest1, "B");

		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}

//왜 B가 다 0이냐 => 객체마다 가지고 있는 스레드가 다르기 때문입니다. (객체가 다르기 때문에)


class ThreadTest3 implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("===============================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + " TestNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}