package com.hw.studyroom;

public class Management {
	private int currentNo;
	private int num;
	
	Customer cst[] = new Customer[10];
	SeatManage seatMan = new SeatManage();
	
	public Management() {
		
	}
	
	public Management(int currnetNo) {
		this.currentNo = currnetNo;
	}
	
	void setIn() {
		if(num == 1) {
			
		}
			currentNo++;
	}
	
	void setOut() {
		
	}
	
	void admin() {
		
	}
	
}
