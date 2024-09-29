package org.example.etidades;

public class Retangulo {

	public double width;
	public double height;

	public double area(double width, double height) {
		return width * height;
	}

	public double perimeter(double width, double height) {
		return 2 * (width + height);
	}
}

