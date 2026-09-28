package com.krakedev.figuras;

public class Triangulo extends Figura{
	private int base;
	private int altura;
	
	public Triangulo(String nombre, String color) {
		super(nombre, color);
	}

	public Triangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", nombre=" + super.getNombre() + ", color=" + super.getColor() +"]";
	}
	
	@Override
	public double calcularArea() {
		return (base * altura)/2;
	}
	
	
}
