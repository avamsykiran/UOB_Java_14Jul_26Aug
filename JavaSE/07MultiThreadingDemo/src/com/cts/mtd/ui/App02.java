package com.cts.mtd.ui;

import com.cts.mtd.service.NumericSeries;

public class App02 {
	public static void main(String a[] ) {
		NumericSeries ns1 = new NumericSeries(1, 10);
		NumericSeries ns2 = new NumericSeries(100, 110);
		
		//ns1.run();
		//ns2.run();
		
		Thread t1 = new Thread(ns1, "sereis1");
		Thread t2 = new Thread(ns2, "sereis2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+">> says 'am done' ");
	}
}
