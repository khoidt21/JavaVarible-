package com.company.example;

import java.awt.RadialGradientPaint;

public class Circle {
	
	private double pi = 3.14;
	private int radius;
	private int r;
	private String color;
	
	public Circle(int radius,int r) {
		this.radius = radius;
		this.r = r;
	}
	public Circle(String color) {
		this.color = color;
	}
	// Tinh dien tich
	public double calAcereage() {
		return (radius * radius) * pi;
	}
	// Tinh chu vi hinh tron 
	public double calPerimeter() {
		return r * 2 * pi;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void displayColor() {
		System.out.println("Color: " + color);
	}
	
}
