package com.javalec.Collections;

import java.util.HashMap;
import java.util.Iterator;

public class Test_Map {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		System.out.println(hashMap.toString());
		System.out.println();
		
		String str = hashMap.get(2);
		System.out.println(str);
		System.out.println();
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		System.out.println();
		
		hashMap.clear();
		System.out.println(hashMap.toString());
		System.out.println();
		
		
		hashMap.put(0, "str0"); 
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		System.out.println(hashMap.toString());
		System.out.println();
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String string = hashMap.get(iterator.next());
			System.out.println(string);
		}
				
	}
}


