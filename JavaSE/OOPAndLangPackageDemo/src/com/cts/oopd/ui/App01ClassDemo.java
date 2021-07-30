package com.cts.oopd.ui;

import com.cts.oopd.model.Rectangle;

public class App01ClassDemo {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10,34);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(100);
		System.out.println(r2);
		
		Rectangle r3 = r1;
		r3.setLength(2);

		Rectangle r4 = new Rectangle(r2);
		r4.setLength(2);

		Rectangle r5 = new Rectangle();
		
		System.out.println(r1); 
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
	}

}
