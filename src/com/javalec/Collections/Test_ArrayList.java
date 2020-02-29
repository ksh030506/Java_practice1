package com.javalec.Collections;

import java.util.ArrayList;

public class Test_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		
		System.out.println(arrayList.toString());
		System.out.println();
		
		String index3 = arrayList.get(3);
		System.out.println("index3 = " + index3);
		System.out.println();
		
		
		arrayList.set(2, "str222222");
		System.out.println(arrayList.toString());
		System.out.println();
		
		int size = arrayList.size();
		System.out.println("size = " + size);
		System.out.println();
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		System.out.println();
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		System.out.println();
		
		arrayList = null;
		System.out.println(arrayList);
		System.out.println(arrayList.toString());
		System.out.println(arrayList.size());
	}
}
