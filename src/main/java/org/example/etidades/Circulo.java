package org.example.etidades;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);  // Fórmula: π * raio^2
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
