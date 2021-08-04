package com.cts.oopd.estimator.model;

public class RectangularBoard implements Board{

	private double length;
	private double bredth;
	
	public RectangularBoard(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public double getArea() {
		return length*bredth;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+bredth);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}

	
}
