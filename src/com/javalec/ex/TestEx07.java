package com.javalec.ex;

import java.util.Scanner;

public class TestEx07 {
	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력해 주세요 >> ");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		TestEx07 guGuDan = new TestEx07();
		guGuDan.gugudan(input);
	}
	
	public void gugudan(int i) {
		for(int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j +" = " + i*j );
		}
	}
}
 