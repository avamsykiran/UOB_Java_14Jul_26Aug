package com.cts.oopd.model;

public class JewelleryProduct extends Product {
	public JewelleryProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public JewelleryProduct(int icode, String name, double price) {
		super(icode, name, price);
	}

	@Override
	public double getGST() {
		return this.getPrice()*0.18;
	}

}
