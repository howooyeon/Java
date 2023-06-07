package com.kh.ch01_abstration.model.vo;

public class Student {
	
	/*
	 * public String name;
	 * public int age;
	 * public double height;
	 */
	
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * Student s1 = new Student();
	 * 주소값을 담고 있음. 기본 자료형이 아니라
	 * 여기까지는 Heap영역에 할당된 공간에는 자바 가상 머신의 초기값들이 세팅
	 * 각 영역에 직접 접근해서 내가 원하는 값 대입 => public이라 개방됨
	 * 
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	public String information() {
		return "moon.getName : " + name;
	}
	
}
