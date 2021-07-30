package com.cts.oopd.model;

public abstract class Product {

	private int icode;
	private String name;
	private double price;

	public Product() {
	}

	public Product(int icode, String name, double price) {
		super();
		this.icode = icode;
		this.name = name;
		this.price = price;
	}

	public int getIcode() {
		return icode;
	}

	public void setIcode(int icode) {
		this.icode = icode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract double getGST();

	public double getSellingPrice() {
		return price + getGST();
	}

	@Override
	public String toString() {
		return "Item [icode=" + icode + ", name=" + name + ", price=" + price + ", GST=" + getGST() + ", SellingPrice="
				+ getSellingPrice() + "]";
	}

}
