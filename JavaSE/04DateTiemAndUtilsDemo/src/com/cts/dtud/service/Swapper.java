package com.cts.dtud.service;

public class Swapper<T> {
	
	public void doSwap(T a,T b) {
		System.out.println("Before Swap "+a+"\t"+b);
		T t=a;
		a=b;
		b=t;
		System.out.println("After Swap "+a+"\t"+b);
	}

}
