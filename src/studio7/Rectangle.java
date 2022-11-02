package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	//instance variables 
	
	private double width;
	private double length;
	private double area;
	private double perimiter;
	
	
	//constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	
	//setter for setting the area
	public void setArea() {
		this.area = this.width*this.length;
	}
	
	//getter for getting area
	public double getArea() {
		return this.area;
	}
	
	//setter for setting perimiter
	public void setPerimiter() {
		this.perimiter = 2*this.length + 2*this.width;
	}
	
	//getter for getting the perimiter
	public double getPerimiter() {
		return this.perimiter;
	}
	
	//method for determingig if square?
	public boolean isSquare() {
		return (this.length == this.width);  //returns true if length equals width false if not
	}
	
	public void drawRectanlge() {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.02);
		StdDraw.filledRectangle(this.length, this.width, this.length/2.0, this.width/2.0);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a rectangle object
		Rectangle r1 = new Rectangle(0.4, 0.3);
		r1.drawRectanlge();
		//CREATE A 2ND RECTANNGLE OBJECT
		Rectangle r2 = new Rectangle(0.9,0.9);
		r2.drawRectanlge();
	}

}
