package com.cts.mtd.service;

public class NumericSeries implements Runnable{

	private int lb;
	private int ub;
	
	public NumericSeries(int lb, int ub) {
		super();
		this.lb = lb;
		this.ub = ub;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=lb;i<=ub;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname + ">>" + i);
		}		
	}

}
