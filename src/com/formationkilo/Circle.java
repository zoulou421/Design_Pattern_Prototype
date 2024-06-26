package com.formationkilo;

public class Circle extends Figure{

	public Circle(Point p1, Point p2) {
		super(p1, p2);
	}

	@Override
	public double surface() {
		double r=p1.distance(p2);
		return Math.PI*r*r;
	}

	@Override
	public String toString() {
		return "Circle ["+ super.toString()+"]";
	}
	
	

}
