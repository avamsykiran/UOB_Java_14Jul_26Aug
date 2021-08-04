package com.cts.oopd.ui;

import com.cts.oopd.estimator.model.CircularBoard;
import com.cts.oopd.estimator.model.RectangularBoard;
import com.cts.oopd.estimator.service.Estimator;

public class App05InterfaceDemo {
	
	public static void main(String args[]) {
		RectangularBoard rb = new RectangularBoard(10, 10);
		CircularBoard cb = new CircularBoard(10);
		
		Estimator est = new Estimator(120.0, 55.0);
		
		System.out.println(est.estiamtePaintingCost(rb));
		System.out.println(est.estiamtePaintingCost(cb));
	}

}
