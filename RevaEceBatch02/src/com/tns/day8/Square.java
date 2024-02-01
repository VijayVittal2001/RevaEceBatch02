package com.tns.day8;

public class Square extends Shape {
	private float side;

	public Square() {
		side=4.0f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	void calArea()
	{
		area=side*side;
	}
	
	
	

}
