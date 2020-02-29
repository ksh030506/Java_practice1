package com.javalec.Collections;

import java.util.HashSet;

public class HashSet_Main {
	public static void main(String[] args) {
		HashSet<Student> hashset = new HashSet<Student>();
		
		hashset.add(new Student("홍길동", 3));
		hashset.add(new Student("홍길순", 4));
		hashset.add(new Student("김상현", 6));
		
		System.out.println(hashset.toString());
		
		System.out.println();
		//remove
		Student student = new Student("김상현", 6);   //주소값이 다르기 때문에 삭제가 안된다.
		
		
		//하지만 기초데이터는 가르키는 주소값이 동일하기 때문에 삭제 가능
		hashset.remove(student);
		System.out.println(hashset.toString());
	}
}



class Student {
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {   //꼭 toString을 오버라이드를 해야한다
		return name + " : " + grade;
	}
	
	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}