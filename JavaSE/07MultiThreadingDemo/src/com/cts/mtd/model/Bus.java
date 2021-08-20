package com.cts.mtd.model;

public class Bus {
	
	private int seatCount;
	private int lastAllotedSeat;
	
	public Bus(int seatCount) {
		this.seatCount = seatCount;
		this.lastAllotedSeat=0;
	}

	public int getLastAllotedSeat() {
		return lastAllotedSeat;
	}

	public void setLastAllotedSeat(int lastAllotedSeat) {
		this.lastAllotedSeat = lastAllotedSeat;
	}

	public int getSeatCount() {
		return seatCount;
	}

}
