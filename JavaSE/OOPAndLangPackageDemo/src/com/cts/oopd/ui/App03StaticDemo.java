package com.cts.oopd.ui;

import com.cts.oopd.model.Vendor;

public class App03StaticDemo {
	
	public static void main(String args[]) {
		
		System.out.println(Vendor.getCount());
		Vendor v1 = new Vendor(1,"Vamsy");
		System.out.println(Vendor.getCount());
		Vendor v2 = new Vendor(2,"Suman");
		System.out.println(Vendor.getCount());
		Vendor v3 = new Vendor(3,"Sreenu");
		System.out.println(Vendor.getCount());
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
