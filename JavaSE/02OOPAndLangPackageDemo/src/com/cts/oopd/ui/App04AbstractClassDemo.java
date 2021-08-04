package com.cts.oopd.ui;

import com.cts.oopd.model.FarmProduct;
import com.cts.oopd.model.FuelProduct;
import com.cts.oopd.model.JewelleryProduct;

public class App04AbstractClassDemo {
	
	public static void main(String args[]) {
		FarmProduct fp = new FarmProduct(1,"RiceBag",4000);
		JewelleryProduct jp = new JewelleryProduct(2,"1Gram Gold",4000);
		FuelProduct flp=new FuelProduct(3, "tank full desile", 4000);
		
		System.out.println(fp);
		System.out.println(jp);
		System.out.println(flp);
	}

}
