package com.cts.oopd.estimator.model;

public class CircularBoard implements Board {

	private double radius;

	public CircularBoard(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	
	
}
