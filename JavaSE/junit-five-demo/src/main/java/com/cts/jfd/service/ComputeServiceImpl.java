package com.cts.jfd.service;

import com.cts.jfd.exception.InvalidDivisorException;

public class ComputeServiceImpl {
	
	public int sum(int a,int b) {
		return a+b;
	}

	public int dif(int a,int b) {
		return a-b;
	}
	
	public int prd(int a,int b) {
		return a*b;
	}
	
	public int qut(int a,int b) throws InvalidDivisorException {
		if(b==0)
			throw new InvalidDivisorException();
		return a/b;
	}
}
