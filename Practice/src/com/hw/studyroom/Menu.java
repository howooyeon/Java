package com.hw.studyroom;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/*
		 * 메뉴를 출력
		 * 선택된 메뉴에 해당 메소드를 호출
		 * 4를 입력 받으면, 프로그램 종료
		 * 
		 * Management 클래스의 객체를 선언하여, 전체 프로그램을 진행하면 됨
		 */
		System.out.println("LaLaLa StudyRoom");
		System.out.println("1. 입장");
		System.out.println("2. 퇴장");
		System.out.println("3. 관리자");
		System.out.println("4. 종료");
		System.out.print("--> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		Management m = new Management();
		
		if (num == 1) {
			m.setIn();
		} else if (num == 2) {
			m.setOut();
		} else if (num == 3) {
			m.admin();
		} else if(num == 4) {
			System.out.println();
			System.out.println("프로그램이 종료됩니다.");
		}

	}

}
