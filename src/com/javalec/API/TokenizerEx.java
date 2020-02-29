package com.javalec.API;

import java.util.StringTokenizer;

public class TokenizerEx {
	public static void main(String[] args) {
		String str1 = "오늘 날씨는 매우 춥고, 눈이 많이 내리고 있습니다.";
		String str2 = "2020/20/20";
		
		StringTokenizer to1 = new StringTokenizer(str1);
		StringTokenizer to2 = new StringTokenizer(str2, "/");
		
		while (to1.hasMoreTokens()) {
			System.out.println(to1.nextToken());
		}
		while (to2.hasMoreTokens()) {
			System.out.println(to2.nextToken());
		}
	}
}
