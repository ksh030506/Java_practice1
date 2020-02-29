package com.javalec.Collections;

import java.util.HashSet;

public class Test_Set {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str0");
		System.out.println(hashSet.toString());
		System.out.println();
		
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		System.out.println();
		
		int i = hashSet.size();
		System.out.println("사이즈 : " + i);
	}
}
