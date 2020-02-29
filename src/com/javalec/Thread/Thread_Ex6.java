package com.javalec.Thread;


//객체 1개 스레드 n개
public class Thread_Ex6 {
	public static void main(String[] args) {
		ThreadTest4 thradTest = new ThreadTest4();
		
		Thread thread0 = new Thread(thradTest, "A");
		Thread thread1 = new Thread(thradTest, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}

//왜 B도 1이냐 => 객체가 하나이기 때문이다(공유)


class ThreadTest4 implements Runnable {

	int testNum = 0;
	
	@Override
	public synchronized void run() {
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