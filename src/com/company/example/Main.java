package com.company.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(5,4);
		Circle circleColor = new Circle("Circel red");
		System.out.println("Dien tich hinh tron " + circle.calAcereage());
	    System.out.println("Chu vi hinh tron " + circle.calPerimeter());
	    circleColor.displayColor();
	    System.out.println("--------------------------------------------");
	    Square square = new Square(5, 4);
	    Square squareColor = new Square("Square black");
	    System.out.println("Dien tich hinh chu nhat " + square.calS());
	    System.out.println("Chu vi hinh chu nhat " + square.calC());
	    squareColor.displayColor();
	    
	}
	
}
