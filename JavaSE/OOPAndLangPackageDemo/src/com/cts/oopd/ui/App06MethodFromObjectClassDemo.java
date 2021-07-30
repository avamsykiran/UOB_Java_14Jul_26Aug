package com.cts.oopd.ui;

import com.cts.oopd.model.Rectangle;

public class App06MethodFromObjectClassDemo {

	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(10, 10);
		Rectangle r2 = new Rectangle(10, 10);
		
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		
	}

}
