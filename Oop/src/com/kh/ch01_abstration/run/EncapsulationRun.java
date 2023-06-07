package com.kh.ch01_abstration.run;

import com.kh.ch01_abstration.model.vo.Student;

public class EncapsulationRun {
	/*
	 * 캡슐화 과정을 적용해서 완벽한 클래스의 형태를 갖추도록
	 * 
	 * 캡슐화 :  추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나
	 * 			클래스에서 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로
	 * 			외부로부터 "데이터 직접 접근"을 막고
	 * 			대신 데이터를 간접적으로나마 처리할 메소드를 클래스 내부에 작성해서 관리
	 * 
	 * 		1) 정보은닉 : private
	 * 					직접 접근을 막기 위해 private라는 접근 제한자를 사용
	 * 		2) setter / getter 메소드를 만들어야 함
	 * 			private 하는 순간 필드에 직접 접근 불가!
	 * 			setter 메소드 : 해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입 메소드
	 * 			getter 메소드 : 해당 필드에 담긴 값을 반환해주는 메소드
	 * 
	 */

	public static void main(String[] args) {
		Student moon = new Student();
		moon.setName("문동은");
		moon.setAge(24);
		moon.setHeight(167);
		moon.setKorScore(100);
		moon.setMathScore(88);
		
		System.out.println(moon.getName());
		System.out.println(moon.information());
		
		
		
		
	}

}
