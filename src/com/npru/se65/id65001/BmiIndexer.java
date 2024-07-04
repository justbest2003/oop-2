package com.npru.se65.id65001;

public class BmiIndexer {
	public double calculateBMI(double height, double weight) {
		double result = (weight/(height*height)*10000);
		return result;
	}
}
