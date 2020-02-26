package com.javalec.StudentManager;

import java.util.ArrayList;

public class StudentManagerMain {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel(); // 선언과 초기화를 동시에!!

	public static void main(String[] args) {
		StudentManagerMain studentManager = new StudentManagerMain();

		studentManager.addStudent("홍길동", 22, 1, "동물학과");
		studentManager.addStudent("김상현", 21, 1, "경영학과");
		studentManager.addStudent("이은경", 25, 1, "국문학과");
		studentManager.addStudent("김순희", 24, 1, "체육학과");
		studentManager.addStudent("홍길순", 23, 1, "무용학과");
		
	System.out.println(studentManager.students.get(0).getName());
	System.out.println(studentManager.students.get(0).getAge());
	System.out.println(studentManager.students.get(0).getStudentNum());
	System.out.println(studentManager.students.get(0).getMajor());
	
	studentManager.students.get(0).updateInfo(1, "안녕!!");
	
	System.out.println(studentManager.students.get(0).getName());
	}

	private void addStudent(String name, int age, int studentNum, String major) {
		Student student = new Student(name, age, studentNum, major); // 학생한명 생성
		students.add(student); // 방금 만든 학생 한명을 그룹에 넣습니다.
		System.out.println(name + " 학생 정보 입력함!!!");
	} 
}