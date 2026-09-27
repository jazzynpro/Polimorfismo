package com.krakedev.figuras;

public class Rectangulo extends Figura{
	private int base;
	private int altura;
	
	public Rectangulo(String nombre, String color) {
		super(nombre, color);
	}
	
	public Rectangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	public String toString() {
		return "figura [nombre=" + super.getNombre() + ", color=" + super.getColor() +  ", base=" + base + ", altura=" + altura + "]";
	}
	
	
}
