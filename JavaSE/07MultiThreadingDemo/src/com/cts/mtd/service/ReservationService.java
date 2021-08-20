package com.cts.mtd.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.mtd.model.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatsNeeded;
	private List<Integer> seatsAlloted;

	public ReservationService(Bus bus, int seatsNeeded) {
		super();
		this.bus = bus;
		this.seatsNeeded = seatsNeeded;
		this.seatsAlloted = new ArrayList<Integer>();
	}

	public boolean isBusFull() {
		return bus.getLastAllotedSeat() == bus.getSeatCount();
	}

	public boolean isBusEmpty() {
		return bus.getLastAllotedSeat() == 0;
	}

	public boolean hasAvailability(int seatsNeeded) {
		return (bus.getSeatCount() - bus.getLastAllotedSeat()) >= seatsNeeded;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		synchronized (bus) {
			if (!hasAvailability(seatsNeeded)) {
				System.out.println(tname + ">>says that not enough seats left");
			} else {
				while (seatsNeeded > 0) {
					if (hasAvailability(seatsNeeded)) {
						int seatNumber = bus.getLastAllotedSeat() + 1;
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							System.out.println(e);
						}
						seatsAlloted.add(seatNumber);
						bus.setLastAllotedSeat(seatNumber);
						seatsNeeded--;
					} else {
						System.out.println(tname + " says reservation aborted as we ran out of seats");
						break;
					}
				}
				System.out.println(tname + ">> reserved " + seatsAlloted);
			}
		}
	}

}
