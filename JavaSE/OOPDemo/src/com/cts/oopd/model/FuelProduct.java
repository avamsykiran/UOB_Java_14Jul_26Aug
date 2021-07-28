package com.cts.oopd.model;

public class FuelProduct extends Product {
	public FuelProduct() {
	}

	public FuelProduct(int icode, String name, double price) {
		super(icode, name, price);
	}

	@Override
	public double getGST() {
		return this.getPrice() * 0.70;
	}

}
