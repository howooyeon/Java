package com.hw.studyroom;

import java.util.Scanner;

public class SeatManage {
	private boolean setTable[][];
	private int x;
	private int y;

	// 좌석에 손님이 있으면 true, 빈자리면 false
	
	SeatManage(){
		
	}
	
	SeatManage(boolean setTable[][], int x, int y){
		this.setTable = setTable;
		this.x = x;
		this.y = y;
	}
	
	void clear() {
	//  3. 관리자 => 2. 전체 좌석 리셋하기 메뉴 선택했을 때 실행하는 메소드
		setTable[2][5] = false;
	}
	
	void print() {
		
		for (int x = 1, y = 1; y <= 5; y++) {
			System.out.print("V[" + (x) + (y) + "]  ");
		}
		System.out.println();

		for (int x = 2, y = 1; y <= 5; y++) {
			System.out.print("V[" + (x) + (y) + "]  ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("현재 남은 좌석은 " + 10 + "석 입니다(V:빈좌석/C:찬좌석).");
		System.out.print("원하는 좌석을 고르세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int seatNum = sc.nextInt();
		
		switch(seatNum) {
		case 11:
			System.out.println("선택되었습니다.");
			break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		}
		
		System.out.println();

	}

	
	void setSeat(int x, int y) {
		
	}
	
	void release(int x, int y) {
		
	}
	
}
