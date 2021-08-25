package com.cts.jfd.exception;

public class InvalidDivisorException extends Exception{

	public InvalidDivisorException() {
		super("Zero can not be a divisor");
	}
}
