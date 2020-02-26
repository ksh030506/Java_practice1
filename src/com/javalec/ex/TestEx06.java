package com.javalec.ex;

import java.util.Scanner;

public class TestEx06 {
	public static void main(String[] args) {
		/*
		int[] iArr = {10, 20, 30, 40, 50};
		System.out.println(iArr[3]);
		
		int[] jArr = new int[3];
		jArr[0] = 10;
		jArr[1] = 10;
		*/
		
		
		String[] iArrName = {"영희", "철수", "길동", "영수", "말자"};
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArrName[i] + "키를 입력하세요 >> ");
			iArr[i] = in.nextInt();
			totalHeight += iArr[i];
		}
		
		System.out.println("학생들의 평균 신장은 " +totalHeight/iArrName.length);
		
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i] > maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("가장 큰 학생은 " + iArrName[maxHIndex] + "입니다.");
		
		minH = maxH;
		
		for (int i = 0; i < iArr.length;  i++) {
			if(iArr[i] < minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + iArrName[minHIndex]);
		
		
	}
}