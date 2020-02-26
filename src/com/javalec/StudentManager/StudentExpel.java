package com.javalec.StudentManager;

import java.util.ArrayList;

class StudentExpel { // 재적 학생을 관리하는 클래스
	ArrayList<Student> expelStudents; // Student -> 객체 타입

	public StudentExpel() {
		expelStudents = new ArrayList<Student>(); // 재적하는 모든학생을 관리하는 객체
	}

	public void addExpelStudent(String name, int age, int studentNum, String major) {
		expelStudents.add(new Student(name, age, studentNum, major));
		System.out.println("재적학생 정보 등록 완료!!!");
	}
}