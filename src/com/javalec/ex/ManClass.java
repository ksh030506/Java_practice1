package com.javalec.ex;


public class ManClass {
	private int age;
	private int height;
	private int whight;
	private String phoneNum;
	
	public ManClass() {}
	
	public ManClass(int age, int height, int whight, String phoneNum) {
		this.age = age;
		this.height = height;
		this.whight = whight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {
		double result = whight / (height * height);
		return result;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWhight() {
		return whight;
	}

	public void setWhight(int whight) {
		this.whight = whight;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
