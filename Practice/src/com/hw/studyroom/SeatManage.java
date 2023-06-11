package com.hw.studyroom;

public class SeatManage {
	private boolean setTable[][];
	private int x;
	private int y;

	// 좌석에 손님이 있으면 true, 빈자리면 false
	
	SeatManage(){
		setTable[x][y] = false;
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
	
		System.out.println("V[" + y +"]");
	}
	
	void setSeat(int x, int y) {
		
	}
	
	void release(int x, int y) {
		
	}
	
}
