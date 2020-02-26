package com.javalec.ex;

import java.util.Scanner;

public class TestEx01 {
	public static void main(String[] args) {
		
		char a = 'a';
		int i = 1;
		double d = 3.14D;
		boolean b = true;
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
		int ii = 10;
		double dd = ii;
		
		double d2 = 3.14D;
		int aa = (int)d2;
		
		System.out.println(ii);
		System.out.println(aa);
		
		int h = 5;
		String aa1 = "맞습니다.";
		String aa2 = "아닙니다.";
		
		//삼항 연산자
		String result = h != 5 ? aa1 : aa2;
		System.out.println(result);
		
		System.out.println("숫자를 하나 입력해 주세요 >> ");
		Scanner in = new Scanner(System.in);
		int i2 = in.nextInt();
		
		System.out.println("i를 3으로 나누어서 나머지가 0이 나오면 사용자가 입력한 숫자는 3의 배수 입니다.");
		System.out.println("i % 3 = " + (i2 % 3));
		
		
	}
}