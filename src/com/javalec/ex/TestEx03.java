package com.javalec.ex;

import java.util.Scanner;

public class TestEx03 {
	public static void main(String[] args) {
		int i = 10;
		Scanner in = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 >>");
		int kor = in.nextInt();
		System.out.print("영어 점수를 입력하세요 >>");
		int eng = in.nextInt();
		System.out.println("수학 점수를 입력하세요 >>");
		int math = in.nextInt();
		
		double avg = (kor + eng +math) / 3;
		
		System.out.println("평균점수는 " + avg);
		
		if(kor > avg) {
			System.out.println("국어 점수가 평균 보다 높습니다.");
		} else if(kor == avg) {
			System.out.println("국어 점수가 평균과 동일 합니다.");
		} else {
			System.out.println("국어 점수가 평균 보다 낮습니다.");
		}
		
		if(eng > avg) {
			System.out.println("영어 점수가 평균 보다 높습니다.");
		} else if(kor == avg) {
			System.out.println("영어 점수가 평균과 동일 합니다.");
		} else {
			System.out.println("영어 점수가 평균 보다 낮습니다.");
		}
		
		if(math > avg) {
			System.out.println("수학 점수가 평균 보다 높습니다.");
		} else if(kor == avg) {
			System.out.println("수학 점수가 평균과 동일 합니다.");
		} else {
			System.out.println("수학 점수가 평균 보다 낮습니다.");
		}
	}
}
