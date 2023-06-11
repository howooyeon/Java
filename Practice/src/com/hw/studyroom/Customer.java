package com.hw.studyroom;

public class Customer extends Person{
	private int seatID;
	
	public Customer() {
		 
	}
	
	public Customer(String name, int seatID) {
		super(name);
		this.seatID = seatID;
	}
}
