package com.javalec.API;

public class Test01 {
	public static void main(String[] args) {
		String str1 = "123456";
		String str2 = "assadf";
		String str3 = "qwertyewer";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(3));
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf(5));
		
		System.out.println();
		System.out.println();
		
		
		StringBuilder string = new StringBuilder("abcd");
		
		string.append("efg");
		System.out.println(string);
		
		string.insert(3, "AAA");
		System.out.println(string);
		
		string.delete(3, 5);
		System.out.println(string);
		
		string.deleteCharAt(5);
		System.out.println(string);
	}
}
