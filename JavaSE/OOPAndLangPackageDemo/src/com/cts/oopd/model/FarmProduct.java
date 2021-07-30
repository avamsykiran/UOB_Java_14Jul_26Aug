package com.cts.oopd.model;

public class FarmProduct extends Product {

	public FarmProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public FarmProduct(int icode, String name, double price) {
		super(icode, name, price);
	}

	@Override
	public double getGST() {
		return 0;
	}

}
