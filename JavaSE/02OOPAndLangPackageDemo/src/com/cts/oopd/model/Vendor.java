package com.cts.oopd.model;

public class Vendor {
	
	private static int count;
	
	private int vendorId;
	private String name;
	
	public Vendor(){
		
	}

	public Vendor(int vendorId, String name) {
		count++;
		this.vendorId = vendorId;
		this.name = name;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", name=" + name + "]";
	}

	public static int getCount() {
		return count;
	}
}
