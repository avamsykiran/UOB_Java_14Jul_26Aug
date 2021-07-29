package com.cts.oopd.estimator.service;

import com.cts.oopd.estimator.model.Board;

public class Estimator {

	private double paintingRate;
	private double borderingRate;
	
	public Estimator(double paintingRate, double borderingRate) {
		super();
		this.paintingRate = paintingRate;
		this.borderingRate = borderingRate;
	}

	public double getPaintingRate() {
		return paintingRate;
	}

	public void setPaintingRate(double paintingRate) {
		this.paintingRate = paintingRate;
	}

	public double getBorderingRate() {
		return borderingRate;
	}

	public void setBorderingRate(double borderingRate) {
		this.borderingRate = borderingRate;
	}
	
	public double estiamtePaintingCost(Board b) {
		return b.getArea()*paintingRate;
	}
	
	public double estiamteBorderingCost(Board b) {
		return b.getPerimeter()*borderingRate;
	}
}
