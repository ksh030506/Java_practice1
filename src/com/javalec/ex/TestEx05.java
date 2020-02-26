package com.javalec.ex;

public class TestEx05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i는 " + i + "입니다");
			if (i >= 3)
				continue;
		}

		System.out.println();
		System.out.println();

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

		int sum1 = 0;
		for (int j = 0; j <= 10; j++) {
			int h = j % 2;
			if (h == 0) {
				sum1 += j;
			}
		}
		System.out.println("1부터 10까지의 짝수합 : " + sum1);

		
		
		System.out.println();
		System.out.println();
		System.out.println("구구단");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (j*i) + "\t");
			}
			System.out.println("");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int jj = 0;
		while(jj <= 10) {
			System.out.println("i는 " + jj + "입니다");
			jj++;
		}
	}
}
