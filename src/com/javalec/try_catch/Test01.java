package com.javalec.try_catch;

public class Test01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		try {
			System.out.println(i / j);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println(i + j);
		System.out.println(i - j);
	}
}
