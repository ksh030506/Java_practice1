package com.javalec.ex;

import java.util.Scanner;

public class TestEx04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		int result = i % 2;
		
		switch(result) {
		case 0:
			System.out.println("입력하신 숫자는 짝수 입니다.");
			break;
		case 1:
			System.out.println("입력하신 숫자는 홀수 입니다.");
			break;
		default:
			System.out.println("숫자가 아닙니다.");
			break;
		}
	}
}
