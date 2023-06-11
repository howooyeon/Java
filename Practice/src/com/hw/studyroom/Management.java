package com.hw.studyroom;

import java.util.Scanner;

public class Management {
	private int currentNo;
	private String name;

	
	Customer cst[] = new Customer[10];
	SeatManage seatMan = new SeatManage();
	Scanner sc = new Scanner(System.in);
	
	public Management() {
		
	}
	
	public Management(int currnetNo) {
		this.setCurrentNo(currnetNo);
		
	}
	
	void setIn() {
		System.out.println();
		System.out.println();
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		setCurrentNo(getCurrentNo() + 1);
		
		seatMan.print();
	}
	
	void setOut() {
		System.out.println();
		System.out.println();
		
		System.out.print("이름을 입력하세요 : ");
		String name1 = sc.nextLine();
		
			System.out.println();
			System.out.println("당신의 좌석 번호는 " + 11 + " 번입니다.");
			System.out.println("해제되었습니다.");
			
			System.out.println();

		return;

	}
	
	void admin() {
		
	}

	public int getCurrentNo() {
		return currentNo;
	}

	public void setCurrentNo(int currentNo) {
		this.currentNo = currentNo;
	}
	
}
