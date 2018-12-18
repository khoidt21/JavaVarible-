package com.company.example;

public class Square {
	// dien tich 
	//S = a.b;
	//C = 2(a+b);
	 private double a;
	 private double b;
	 private String color;
	 
	 public Square(String color) {
		 this.color = color;
	 }
	 public Square(double a, double b) {
		 this.a = a;
		 this.b = b;
	 }
	 public String getColor() {
			return color;
	 }
	 public void setColor(String color) {
			this.color = color;
	 }
	 public double getA() {
			return a;
	 }
	 public void setA(double a) {
			this.a = a;
		}
	 public double getB() {
			return b;
	 }
	 public void setB(double b) {
			this.b = b;
	 }
	 public double calS(){
		 return a * b;
	 }
	 public double calC(){
		 return 2*(a + b);
	 }
	 public void displayColor() {
		 System.out.println("Color " + color);
	 }
	 
}
