package Shapes;



public class Square {
private double sideLength; 
 


public Square() {
	this.sideLength = 1.0f;
	
	
	
}
	public Square(double sideLength) {
		if (sideLength <= 0) {
			this.sideLength = 1.0f;
		}
		this.sideLength = sideLength;

	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getArea() {
		return this.sideLength * sideLength;
	}
	
	
	
	
	
	
	
}
