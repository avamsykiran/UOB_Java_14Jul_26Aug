package com.cts.mtd.ui;

import com.cts.mtd.model.Bus;
import com.cts.mtd.service.ReservationService;

public class App03 {

	public static void main(String[] args) {

		Bus bus = new Bus(25);
		
		ReservationService rs1 = new ReservationService(bus, 10);
		ReservationService rs2 = new ReservationService(bus, 10);
		ReservationService rs3 = new ReservationService(bus, 10);
		
		Thread t1 = new Thread(rs1, "t1");
		Thread t2 = new Thread(rs2, "t2");
		Thread t3 = new Thread(rs3, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
